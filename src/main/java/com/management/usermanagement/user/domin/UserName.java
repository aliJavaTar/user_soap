package com.management.usermanagement.user.domin;

public record UserName(String username) {
    public UserName {
        UserValidation userValidation = new UserValidation(username);
        if (userValidation.getUsernameValid().isBlank())
            throw new RuntimeException("user name Not valid");
        username= userValidation.username();
    }

    public String getUsername() {
        return username;
    }
}
