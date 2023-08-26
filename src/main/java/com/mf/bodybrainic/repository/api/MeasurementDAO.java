package com.mf.bodybrainic.repository.api;

import com.mf.bodybrainic.model.Measurement;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MeasurementDAO extends JpaRepository<Measurement,Long> {
    List<Measurement> findAllByPatientId(Long patientId);
}
