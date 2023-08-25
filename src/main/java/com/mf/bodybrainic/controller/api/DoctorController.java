package com.mf.bodybrainic.controller.api;

import com.mf.bodybrainic.model.dto.DoctorPersonDTO;
import com.mf.bodybrainic.model.dto.HandlePasswordDTO;
import org.apache.coyote.Response;
import org.springframework.http.ResponseEntity;

import java.io.IOException;
import java.util.List;

public interface DoctorController {

    public ResponseEntity<List<DoctorPersonDTO>> readAllDoctors();
    public ResponseEntity<DoctorPersonDTO> readDoctorById(Long id);
    public ResponseEntity<byte[]> readDoctorAvatar(String path) throws IOException;

    public ResponseEntity<DoctorPersonDTO> changeDoctorPassword(HandlePasswordDTO handlePasswordDTO);
}
