package com.mf.bodybrainic.controller.api;

import com.mf.bodybrainic.model.dto.MeasurementDTO;
import org.springframework.core.io.Resource;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface MeasurementController {

    public ResponseEntity<List<MeasurementDTO>> readAllByPatientId(Long id);

    public ResponseEntity<Resource> getCSVByPath(String path);
}
