package com.mf.bodybrainic.controller.impl;

import com.mf.bodybrainic.controller.api.MeasurementController;
import com.mf.bodybrainic.model.dto.MeasurementDTO;
import com.mf.bodybrainic.service.api.MeasurementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping(path = "/bodybrainic/measurement")
public class MeasurementControllerImpl implements MeasurementController {

    @Autowired
    private MeasurementService measurementService;

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


}
