package com.mf.bodybrainic.service.impl;

import com.mf.bodybrainic.model.Measurement;
import com.mf.bodybrainic.model.dto.MeasurementDTO;
import com.mf.bodybrainic.repository.api.MeasurementDAO;
import com.mf.bodybrainic.service.api.MeasurementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MeasurementServiceImpl implements MeasurementService {

    @Autowired
    MeasurementDAO measurementDAO;

    @Override
    public List<MeasurementDTO> getAllByPatientId(Long patientId) {
        List<MeasurementDTO> mList = new ArrayList<>();
        List<Measurement> measurements = measurementDAO.findAllByPatientId(patientId);
        for(Measurement measurement:measurements){
            mList.add(new MeasurementDTO(measurement));
        }
        return mList;
    }
}
