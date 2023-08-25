package com.mf.bodybrainic.service.impl;

import com.mf.bodybrainic.model.Patient;
import com.mf.bodybrainic.model.dto.PatientPersonDTO;
import com.mf.bodybrainic.repository.api.PatientDAO;
import com.mf.bodybrainic.service.api.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class PatientServiceImpl implements PatientService {

    @Autowired
    PatientDAO patientDAO;

    @Override
    public List<PatientPersonDTO> getAllPatients() {
        List<PatientPersonDTO> ppList = new ArrayList<>();
        List<Patient> pats = patientDAO.findAll();
        for(Patient pat:pats){
            ppList.add(new PatientPersonDTO(pat,pat.getPerson()));
        }
        return ppList;
    }

    @Override
    public PatientPersonDTO getPatientById(Long id) {
        Optional<Patient> optionalPatient = patientDAO.findById(id);
        if(optionalPatient.isPresent()){
            Patient pat = optionalPatient.get();
            return new PatientPersonDTO(pat, pat.getPerson());
        } else {
            return null;
        }
    }

    @Override
    public List<PatientPersonDTO> getPatientsByDoctorId(Long doctorId) {
        List<PatientPersonDTO> ppList = new ArrayList<>();
        List<Patient> pats = patientDAO.findAllByDoctorId(doctorId);
        for(Patient pat:pats){
            ppList.add(new PatientPersonDTO(pat,pat.getPerson()));
        }
        return ppList;
    }
}
