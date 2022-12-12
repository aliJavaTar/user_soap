package com.management.usermangement.user.infrastructure;

import com.management.usermangement.role.domain.Role;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "user")
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;
    @Column(name = "USER_NAME")
    private String username;
    @Column(name = "NATIONAL_ID")
    private String nationalID;
    @ManyToOne()
    @JoinColumn(name = "ROLE_ID")
    private Role role;
}