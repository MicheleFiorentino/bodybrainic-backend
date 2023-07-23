package com.mf.bodybrainic.service.impl.auth;

import com.mf.bodybrainic.model.Doctor;
import com.mf.bodybrainic.model.dto.DoctorPersonDTO;
import com.mf.bodybrainic.model.dto.LoginDTO;
import com.mf.bodybrainic.repository.api.DoctorDAO;
import com.mf.bodybrainic.service.api.auth.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
public class LoginServiceImpl implements LoginService {

    @Autowired
    private DoctorDAO doctorDAO;

    @Override
    @Transactional(readOnly = true)
    public LoginDTO authenticate(LoginDTO loginDTO) {
        Optional<Doctor> optionalDoctor = doctorDAO.findByPersonEmail(loginDTO.getEmail());
        if(optionalDoctor.isPresent()){
            Doctor doc = optionalDoctor.get();
            if(doc.getPassword().equals(loginDTO.getPassword())){
                loginDTO.setId(doc.getId());
                return loginDTO;
            }
        }
        return null;
    }
}
