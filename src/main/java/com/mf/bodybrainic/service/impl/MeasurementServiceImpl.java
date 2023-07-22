package com.mf.bodybrainic.service.impl;

import com.mf.bodybrainic.repository.api.MeasurementDAO;
import com.mf.bodybrainic.service.api.MeasurementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MeasurementServiceImpl implements MeasurementService {

    @Autowired
    MeasurementDAO measurementDAO;

}
