package com.management.usermanagement.user.domin;

import com.management.usermanagement.role.domain.Role;
import com.management.usermanagement.user.infrastructure.dto.request.UserRequest;

import java.util.Objects;
import java.util.Optional;

public class User {
    private final String nationalID;
    private final Role role;
    private Long id;
    private Username username;

    private User(Username userName, Long id, String nationalID, Role role) {
        this.username = userName;
        this.id = id;
        this.nationalID = nationalID;
        this.role = role;
    }

    private User(Username username, String nationalID, Role role) {
        this.username = username;
        this.nationalID = nationalID;
        this.role = role;
    }

    public static User createUser(Username username, Long id, String nationalID, Role role) {
        return new User(username, id, nationalID, role);
    }

    public static Optional<User> createUser(UserRequest request) {
        Username isValidUsername = new Username(request.getUsername().getUsername());
        return Optional.of(new User(isValidUsername, request.getNationalID(), request.getRole()));
    }

    public Username getUsername() {
        return username;
    }

    public void setUsername(Username username) {
        this.username = username;
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
        return Objects.equals(username, user.username) &&
                Objects.equals(id, user.id) &&
                Objects.equals(nationalID, user.nationalID) &&
                Objects.equals(role, user.role);
    }

    @Override
    public int hashCode() {
        return Objects.hash(username, id, nationalID, role);
    }
}
