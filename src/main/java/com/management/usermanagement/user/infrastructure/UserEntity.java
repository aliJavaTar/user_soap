package com.management.usermanagement.user.infrastructure;

import com.management.usermanagement.role.domain.Role;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "user")
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID")
    private Long id;

    @Embedded
    private UserValidation userValidation;

    @Column(name = "NATIONAL_ID")
    private String nationalID;
    @ManyToOne()
    @JoinColumn(name = "ROLE_ID")
    private Role role;

    public UserEntity(UserValidation userValidation, String nationalID, Role role) {
        this.userValidation = userValidation;
        this.nationalID = nationalID;
        this.role = role;
    }
}