package com.management.usermanagement.role.infrastructure;

import com.management.usermanagement.base.BaseEntity;
import com.management.usermanagement.permission.domin.Permission;
import com.management.usermanagement.permission.infrastructure.PermissionEntity;
import jakarta.persistence.*;
import lombok.Getter;

import java.util.Set;

@Entity
@Getter
@Table(name = "ROLES")
public class RoleEntity extends BaseEntity<Long> {

    @Column(name = "ROLE_TITLE")
    private String roleTitle;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "ROLE_PERMISSIONS",
            joinColumns = {@JoinColumn(name = "ROLE_ID", referencedColumnName = "ID")},
            inverseJoinColumns = {@JoinColumn(name = "PERMISSION_ID", referencedColumnName = "ID")})
    private Set<PermissionEntity> permissions;


}


