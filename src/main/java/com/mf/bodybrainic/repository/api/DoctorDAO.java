package com.mf.bodybrainic.repository.api;

import com.mf.bodybrainic.model.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface DoctorDAO extends JpaRepository<Doctor,Long> {
    Optional<Doctor> findByPersonEmail(String email);
}
