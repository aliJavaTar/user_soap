package com.management.usermanagement.user.infrastructure.dto;

import com.management.usermanagement.role.domain.Role;
import lombok.Data;

@Data
public class UserDTO {
    private Long id;
    private String username;
    private String nationalID;
    private Role role;
}
