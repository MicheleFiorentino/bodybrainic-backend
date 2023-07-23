package com.mf.bodybrainic.service.api.auth;

import com.mf.bodybrainic.model.dto.LoginDTO;

public interface LoginService {

    //returns Doctor ID if it exists
    LoginDTO authenticate(LoginDTO loginDTO);
}
