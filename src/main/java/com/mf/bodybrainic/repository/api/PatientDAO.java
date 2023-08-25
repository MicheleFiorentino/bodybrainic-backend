package com.mf.bodybrainic.repository.api;

import com.mf.bodybrainic.model.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PatientDAO extends JpaRepository<Patient,Long> {

    List<Patient> findAllByDoctorId(Long doctorId);
}
