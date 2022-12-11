package com.management.usermangement.user.domin;

import com.management.usermangement.role.domain.Role;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;
    @Column(name = "USER_NAME")
    private String username;
    @Column(name = "NATIONAL_ID")
    private String nationalID;

    public User() {}



    @ManyToOne()
    @JoinColumn(name="ROLE_ID")
    private Role role;

}
