package com.mf.bodybrainic.controller.api;

import com.mf.bodybrainic.model.dto.PatientPersonDTO;
import org.springframework.http.ResponseEntity;

import java.io.IOException;
import java.util.List;

public interface PatientController {

    public ResponseEntity<List<PatientPersonDTO>> readAllPatients();

    public ResponseEntity<PatientPersonDTO> readPatientById(Long id);

    public ResponseEntity<byte[]> readPatientAvatar(String path) throws IOException;

    public ResponseEntity<List<PatientPersonDTO>> readPatientsByDoctorId(Long doctorId);
}
