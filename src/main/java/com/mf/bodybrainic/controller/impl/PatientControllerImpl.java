package com.mf.bodybrainic.controller.impl;

import com.mf.bodybrainic.controller.api.PatientController;
import com.mf.bodybrainic.service.api.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
@RequestMapping(path = "/bodybrainic/patient")
public class PatientControllerImpl implements PatientController {

    @Autowired
    private PatientService patientService;

}
