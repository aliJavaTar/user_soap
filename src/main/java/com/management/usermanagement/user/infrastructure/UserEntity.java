package com.management.usermanagement.user.infrastructure;

import com.management.usermanagement.base.infra.BaseEntity;
import com.management.usermanagement.role.infrastructure.RoleEntity;
import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Objects;

@Entity
@Data
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

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = ROLE_ID)
    private RoleEntity role;

    public UserEntity(Username username, String nationalID, RoleEntity role) {
        this.username = username;
        this.nationalID = nationalID;
        this.role = role;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserEntity user = (UserEntity) o;
        return Objects.equals(username, user.username) &&
                Objects.equals(nationalID, user.nationalID) &&
                Objects.equals(role, user.role);
    }

    @Override
    public int hashCode() {
        return Objects.hash(username, nationalID, role);
    }
}