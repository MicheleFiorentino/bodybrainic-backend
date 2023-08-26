package com.mf.bodybrainic.service.api;

import com.mf.bodybrainic.model.dto.MeasurementDTO;

import java.util.List;

public interface MeasurementService {
    List<MeasurementDTO> getAllByPatientId(Long patientId);
}
