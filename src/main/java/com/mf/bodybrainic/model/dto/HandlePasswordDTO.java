package com.mf.bodybrainic.model.dto;

import lombok.Data;

@Data
public class HandlePasswordDTO {
    Long id;
    String newPassword;
    String oldPassword;
}
