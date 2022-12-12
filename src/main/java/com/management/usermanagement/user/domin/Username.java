package com.management.usermanagement.user.domin;

import java.util.regex.Pattern;

public record Username(String username) {
    public Username {
        String usernameValidation = "^[a-zA-Z]([._-](?![._-])|[a-zA-Z0-9]){3,16}[a-zA-Z0-9]$";
        boolean isValid = Pattern.matches(usernameValidation, username);
        if (!isValid)
            throw new RuntimeException("user name Not valid");
    }

    public String getUsername() {
        return username;
    }
}
