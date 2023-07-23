package com.mf.bodybrainic.controller.impl.auth;

import com.mf.bodybrainic.controller.api.auth.LoginController;
import com.mf.bodybrainic.model.dto.LoginDTO;
import com.mf.bodybrainic.service.api.auth.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping(path = "/bodybrainic/auth")
public class LoginControllerImpl implements LoginController {

    @Autowired
    private LoginService loginService;

    @PostMapping("/login")
    public ResponseEntity<LoginDTO> login(@RequestBody LoginDTO loginDTO){
        loginDTO = loginService.authenticate(loginDTO);
        if(loginDTO != null){
            return ResponseEntity.ok(loginDTO);
        } else {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(null);
        }
    }
}
