package com.management.usermangement.role.domain;

import com.management.usermangement.permission.domin.Permission;
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
    @JoinTable(name = "ID", joinColumns = {
            @JoinColumn(name = "ID")}, inverseJoinColumns = {@JoinColumn(referencedColumnName = "ID")})
    private Set<Permission> permissions;


}
