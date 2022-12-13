package com.management.usermanagement.role.infrastructure.dto.respons;

import com.management.usermanagement.permission.domin.Permission;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class RoleResponse {
    private String roleTitle;

    private Set<Permission> permissions;
}
