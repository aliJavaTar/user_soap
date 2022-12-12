package com.management.usermanagement.user.infrastructure;

import com.management.usermanagement.base.BaseEntity;
import com.management.usermanagement.role.infrastructure.RoleEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "user")
public class UserEntity extends BaseEntity<Long> {

    private static final String ID = "ID";
    private static final String NATIONAL_ID = "NATIONAL_ID";
    private static final String ROLE_ID = "ROLE_ID";

    @Embedded
    private Username username;

    @Column(name = NATIONAL_ID)
    private String nationalID;

    @ManyToOne()
    @JoinColumn(name = ROLE_ID)
    private RoleEntity role;

    public UserEntity(Username username, String nationalID, RoleEntity role) {
        this.username = username;
        this.nationalID = nationalID;
        this.role = role;
    }
}