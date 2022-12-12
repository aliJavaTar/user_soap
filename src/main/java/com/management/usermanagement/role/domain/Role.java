package com.management.usermanagement.role.domain;

import com.management.usermanagement.permission.domin.Permission;
import jakarta.persistence.*;
import lombok.Getter;

import java.util.Set;

@Entity
@Getter
@Table(name = "ROLES")
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID")
    private Long id;
    @Column(name = "ROLE_TITLE")
    private String roleTitle;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "ROLE_PERMISSIONS",
            joinColumns = {@JoinColumn(name = "ROLE_ID", referencedColumnName = "ID")},
            inverseJoinColumns = {@JoinColumn(name = "PERMISSION_ID", referencedColumnName = "ID" )})
    private Set<Permission> permissions;


}
