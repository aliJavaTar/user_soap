package com.management.usermanagement.role.infrastructure.dto.request;


import com.management.usermanagement.permission.domin.Permission;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RoleRequest {
    private String roleTitle;

    private Set<Permission> permissions;
}
