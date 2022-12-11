package com.management.usermangement.user.domin;

import com.management.usermangement.role.domain.Role;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "increment")
    @Column(name = "ID")
    private Long id;
    @Column(name = "USER_NAME")
    private String username;
    @Column(name = "NATIONAL_ID")
    private String nationalID;

    public User() {}



    @ManyToOne
    @JoinColumn(name = "NATIONAL_ID")
    private Role role;


    @Override

    public String toString() {
        return "user_id=" + id +
                ", username='" + username + '\'' +
                ", nationalID='" + nationalID + '\'';
    }
}
