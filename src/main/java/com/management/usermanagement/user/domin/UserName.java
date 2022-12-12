package com.management.usermanagement.user.domin;

public class UserName {
    private final String username;
    private final UserValidation userValidation;

    public UserName(String username) {
        userValidation = new UserValidation(username);
        if (userValidation.getUsernameValid().isBlank())
            throw new RuntimeException("user name Not valid");
        this.username = username;
    }

    public String getUsername() {
        return username;
    }
}
