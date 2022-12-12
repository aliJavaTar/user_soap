package com.management.usermangement.user.domin;

import com.management.usermangement.role.domain.Role;
import lombok.Getter;

@Getter
public class User {
    private final UserName userName;
    private Long id;
    private String nationalID;
    private Role role;


    public User(String username) {
        this.userName = new UserName(username);
    }
}
