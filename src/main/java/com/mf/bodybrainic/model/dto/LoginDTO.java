package com.mf.bodybrainic.model.dto;

import lombok.Data;

@Data
public class LoginDTO {
    public Integer id;
    private String email;
    private String password;
}
