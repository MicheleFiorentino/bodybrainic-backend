package com.mf.bodybrainic.controller.impl;

import com.mf.bodybrainic.service.api.MeasurementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
@RequestMapping(path = "/bodybrainic/measurement")
public class MeasurementControllerImpl {

    @Autowired
    private MeasurementService measurementService;

}
