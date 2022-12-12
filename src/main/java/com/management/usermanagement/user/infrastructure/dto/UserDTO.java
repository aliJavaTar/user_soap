package com.management.usermanagement.user.infrastructure.dto;

import com.management.usermanagement.config.BaseDTO;
import com.management.usermanagement.role.domain.Role;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserDTO extends BaseDTO {
    private String username;
    private String nationalID;
    private Role role;
}
