package com.management.usermanagement.role.domain;

import com.management.usermanagement.permission.domin.Permission;

import java.util.Set;


public class Role {

    private Long id;

    private String roleTitle;


    private Set<Permission> permissions;


}
