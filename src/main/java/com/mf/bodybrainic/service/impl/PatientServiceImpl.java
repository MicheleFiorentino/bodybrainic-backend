package com.mf.bodybrainic.service.impl;

import com.mf.bodybrainic.repository.api.PatientDAO;
import com.mf.bodybrainic.service.api.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PatientServiceImpl implements PatientService {

    @Autowired
    PatientDAO patientDAO;

}
