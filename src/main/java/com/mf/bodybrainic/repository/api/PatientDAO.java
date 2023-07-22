package com.mf.bodybrainic.repository.api;

import com.mf.bodybrainic.model.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientDAO extends JpaRepository<Patient,Long> {
}
