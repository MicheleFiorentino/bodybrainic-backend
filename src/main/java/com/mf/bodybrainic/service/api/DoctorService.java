package com.mf.bodybrainic.service.api;

import com.mf.bodybrainic.model.dto.DoctorPersonDTO;

import java.util.List;

public interface DoctorService {

    List<DoctorPersonDTO> getAllDoctors();
    DoctorPersonDTO getDoctorById(Long id);
}
