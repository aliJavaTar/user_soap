package com.management.usermanagement.user.domin;

import java.util.regex.Pattern;

public record UserValidation(String username) {

    public UserValidation(String username) {
        String usernameValidation = "^[a-zA-Z]([._-](?![._-])|[a-zA-Z0-9]){3,16}[a-zA-Z0-9]$";
        boolean isValid = Pattern.matches(usernameValidation, username);
        if (isValid)
            this.username = username;
        else
            this.username = "";
    }

    public String getUsernameValid() {
        return username;
    }
}
