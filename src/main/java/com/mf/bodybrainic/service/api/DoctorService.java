package com.mf.bodybrainic.service.api;

import com.mf.bodybrainic.model.dto.DoctorPersonDTO;
import com.mf.bodybrainic.model.dto.HandlePasswordDTO;

import java.util.List;

public interface DoctorService {

    List<DoctorPersonDTO> getAllDoctors();
    DoctorPersonDTO getDoctorById(Long id);

    DoctorPersonDTO updateDoctorPassword(HandlePasswordDTO handlePasswordDTO);
}
