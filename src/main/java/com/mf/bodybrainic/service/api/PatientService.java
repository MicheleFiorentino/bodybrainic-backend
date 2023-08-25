package com.mf.bodybrainic.service.api;

import com.mf.bodybrainic.model.dto.PatientPersonDTO;

import java.util.List;

public interface PatientService {

    public List<PatientPersonDTO> getAllPatients();

    public PatientPersonDTO getPatientById(Long id);

    List<PatientPersonDTO> getPatientsByDoctorId(Long id);
}
