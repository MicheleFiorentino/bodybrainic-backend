package com.mf.bodybrainic.service.impl;

import com.mf.bodybrainic.model.Doctor;
import com.mf.bodybrainic.model.dto.DoctorPersonDTO;
import com.mf.bodybrainic.repository.api.DoctorDAO;
import com.mf.bodybrainic.service.api.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class DoctorServiceImpl implements DoctorService {

    @Autowired
    private DoctorDAO doctorDAO;

    @Override
    @Transactional(readOnly = true)
    public List<DoctorPersonDTO> getAllDoctors() {
        List<DoctorPersonDTO> dpList = new ArrayList<>();
        List<Doctor> docs = doctorDAO.findAll();
        for(Doctor doc:docs){
            dpList.add(new DoctorPersonDTO(doc,doc.getPerson()));
        }
        return dpList;
    }

    @Override
    public DoctorPersonDTO getDoctorById(Long id) {
        Optional<Doctor> optionalDoctor = doctorDAO.findById(id);
        if(optionalDoctor.isPresent()){
            Doctor doc = optionalDoctor.get();
            return new DoctorPersonDTO(doc, doc.getPerson());
        } else {
            return null;
        }
    }

}
