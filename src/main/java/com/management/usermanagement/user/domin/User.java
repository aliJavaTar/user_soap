package com.management.usermanagement.user.domin;

import com.management.usermanagement.role.domain.Role;

import java.util.Objects;


public class User {
    private Long id;
    private final UserName userName;
    private final String nationalID;
    private final Role role;

    private User(UserName userName, Long id, String nationalID, Role role) {
        this.userName = userName;
        this.id = id;
        this.nationalID = nationalID;
        this.role = role;
    }

    private User(UserName userName, String nationalID, Role role) {
        this.userName = userName;
        this.nationalID = nationalID;
        this.role = role;
    }

    public static User createUser(UserName userName, Long id, String nationalID, Role role) {
        return new User(userName, id, nationalID, role);
    }

    public static User createUser(UserName userName, String nationalID, Role role) {
        return new User(userName, nationalID, role);
    }

    public UserName getUserName() {
        return userName;
    }

    public Long getId() {
        return id;
    }

    public String getNationalID() {
        return nationalID;
    }

    public Role getRole() {
        return role;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(userName, user.userName) &&
                Objects.equals(id, user.id) &&
                Objects.equals(nationalID, user.nationalID) &&
                Objects.equals(role, user.role);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userName, id, nationalID, role);
    }
}
