package com.mf.bodybrainic.controller.impl;

import com.mf.bodybrainic.controller.api.PatientController;
import com.mf.bodybrainic.model.dto.PatientPersonDTO;
import com.mf.bodybrainic.service.api.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.nio.file.Files;
import java.util.List;

@CrossOrigin
@RestController
@RequestMapping(path = "/bodybrainic/patient")
public class PatientControllerImpl implements PatientController {

    @Autowired
    private PatientService patientService;


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


}
