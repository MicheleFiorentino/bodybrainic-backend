package com.mf.bodybrainic.controller.impl;

import com.mf.bodybrainic.controller.api.PatientController;
import com.mf.bodybrainic.controller.impl.utils.sse.SSEUtil;
import com.mf.bodybrainic.controller.impl.utils.sse.records.PatientSSESignal;
import com.mf.bodybrainic.model.dto.PatientPersonDTO;
import com.mf.bodybrainic.service.api.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.http.codec.ServerSentEvent;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;

import java.io.IOException;
import java.nio.file.Files;
import java.util.List;

@CrossOrigin
@RestController
@RequestMapping(path = "/bodybrainic/patient")
public class PatientControllerImpl implements PatientController {

    @Autowired
    private PatientService patientService;

    @Autowired
    private SSEUtil<PatientSSESignal> sseUtil;

    @Override
    @GetMapping(path="/all")
    @ResponseBody
    public ResponseEntity<List<PatientPersonDTO>> readAllPatients() {
        List<PatientPersonDTO> patList = patientService.getAllPatients();
        return ResponseEntity.ok().body(patList);
    }

    @Override
    @GetMapping(path="/byId")
    @ResponseBody
    public ResponseEntity<PatientPersonDTO> readPatientById(@RequestParam Long id) {
        PatientPersonDTO pp = patientService.getPatientById(id);
        if(pp != null)
            return ResponseEntity.ok().body(pp);
        else
            return ResponseEntity.notFound().build();
    }

    @Override
    @GetMapping(
            path="/avatarByPath",
            produces = MediaType.IMAGE_JPEG_VALUE
    )
    @ResponseBody
    public ResponseEntity<byte[]> readPatientAvatar(@RequestParam String path) throws IOException {
        try {
            // Load the image from the classpath (resources folder)
            ClassPathResource imageResource = new ClassPathResource("static/data/profileImgs/" + path);

            // Read the image bytes into a byte array
            byte[] imageBytes = Files.readAllBytes(imageResource.getFile().toPath());

            // Return the ResponseEntity with the image bytes
            return ResponseEntity.ok(imageBytes);
        } catch (IOException e) {
            // Handle the case when the image is not found or there is an error reading the file
            return ResponseEntity.notFound().build();
        }
    }

    @Override
    @GetMapping(path="/allByDoctorId")
    @ResponseBody
    public ResponseEntity<List<PatientPersonDTO>> readPatientsByDoctorId(@RequestParam Long doctorId) {
        List<PatientPersonDTO> patList = patientService.getPatientsByDoctorId(doctorId);
        return ResponseEntity.ok().body(patList);
    }

    @GetMapping(path="/sse", produces = MediaType.TEXT_EVENT_STREAM_VALUE)
    public Flux<ServerSentEvent<PatientSSESignal>> subscribeToSSE() {
        return sseUtil.subscribe();
    }

    @PostMapping("/patientAdded")
    public ResponseEntity<String> patientCritical(@RequestParam Integer id){
        try {
            PatientSSESignal signal = new PatientSSESignal(id);
            sseUtil.emitSignal(new PatientSSESignal(id));
            return ResponseEntity.ok("patient_added");
        } catch (Error e) {
            return ResponseEntity.badRequest().body(e.toString());
        }
    }
}
