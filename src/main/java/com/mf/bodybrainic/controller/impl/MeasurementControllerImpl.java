package com.mf.bodybrainic.controller.impl;

import com.mf.bodybrainic.controller.api.MeasurementController;
import com.mf.bodybrainic.controller.impl.utils.sse.SSEUtil;
import com.mf.bodybrainic.controller.impl.utils.sse.records.MeasurementSSESignal;
import com.mf.bodybrainic.controller.impl.utils.sse.records.PatientSSESignal;
import com.mf.bodybrainic.model.dto.MeasurementDTO;
import com.mf.bodybrainic.service.api.MeasurementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.http.codec.ServerSentEvent;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping(path = "/bodybrainic/measurement")
public class MeasurementControllerImpl implements MeasurementController {

    @Autowired
    private MeasurementService measurementService;

    @Autowired
    private SSEUtil<MeasurementSSESignal> sseUtil;

    @Override
    @GetMapping(path="/allByPatientId")
    @ResponseBody
    public ResponseEntity<List<MeasurementDTO>> readAllByPatientId(@RequestParam Long patientId) {
        List<MeasurementDTO> mList = measurementService.getAllByPatientId(patientId);
        return ResponseEntity.ok(mList);
    }

    @Override
    @GetMapping(
            path = "/getCSVByPath",
            produces = "text/csv"
    )
    public ResponseEntity<Resource> getCSVByPath(@RequestParam String path) {
        Resource csvResource = new ClassPathResource("static/data/brainwaves/" + path);
        return ResponseEntity.ok(csvResource);
    }

    @GetMapping(path="/sse", produces = MediaType.TEXT_EVENT_STREAM_VALUE)
    public Flux<ServerSentEvent<MeasurementSSESignal>> subscribeToSSE() {
        return sseUtil.subscribe();
    }

    @PostMapping("/measurementAdded")
    public ResponseEntity<String> patientCritical(@RequestParam Integer id){
        try {
            MeasurementSSESignal signal = new MeasurementSSESignal(id);
            sseUtil.emitSignal(new MeasurementSSESignal(id));
            return ResponseEntity.ok("measurement_added");
        } catch (Error e) {
            return ResponseEntity.badRequest().body(e.toString());
        }
    }
}
