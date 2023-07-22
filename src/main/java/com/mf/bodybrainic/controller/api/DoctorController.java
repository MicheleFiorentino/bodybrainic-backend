package com.mf.bodybrainic.controller.api;

import com.mf.bodybrainic.model.dto.DoctorPersonDTO;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface DoctorController {

    public ResponseEntity<List<DoctorPersonDTO>> readAllDoctors();
    public ResponseEntity<DoctorPersonDTO> readDoctorById(Long id);
}
