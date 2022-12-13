package com.management.usermanagement.role.domain;

import com.management.usermanagement.permission.domin.Permission;

import java.util.Objects;
import java.util.Set;


public class Role {

    private Long id;

    private String roleTitle;

    private Set<Permission> permissions;

    public Role(){}

    public Role(String roleTitle, Set<Permission> permissions) {
        this.roleTitle = roleTitle;
        this.permissions = permissions;
    }

    public Set<Permission> getPermissions() {
        return permissions;
    }

    public String getRoleTitle() {
        return roleTitle;
    }

    public void setPermissions(Set<Permission> permissions) {
        this.permissions = permissions;
    }

    public void setRoleTitle(String roleTitle) {
        this.roleTitle = roleTitle;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Role role = (Role) o;
        return Objects.equals(id, role.id) && Objects.equals(roleTitle, role.roleTitle) && Objects.equals(permissions, role.permissions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, roleTitle, permissions);
    }
}
