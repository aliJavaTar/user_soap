package com.management.usermanagement.user.infrastructure.dto;

import com.management.usermanagement.config.BaseDTO;
import com.management.usermanagement.role.domain.Role;
import lombok.Data;

@Data
public class UserDTO extends BaseDTO {

    private String username;
    private String nationalID;
    private Role role;
}
