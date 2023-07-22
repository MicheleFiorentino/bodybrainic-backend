package com.mf.bodybrainic.repository.api;

import com.mf.bodybrainic.model.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DoctorDAO extends JpaRepository<Doctor,Long> {

}
