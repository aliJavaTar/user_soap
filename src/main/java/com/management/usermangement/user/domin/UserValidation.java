package com.management.usermangement.user.domin;

import java.util.regex.Pattern;

public class UserValidation {
    private final String usernameValidation = "^[a-zA-Z]([._-](?![._-])|[a-zA-Z0-9]){3,16}[a-zA-Z0-9]$";

    private final String usernameValid;

    public UserValidation(String usernameValid) {
        boolean isValid = Pattern.matches(usernameValidation, usernameValid);
        if (isValid)
            this.usernameValid = usernameValid;
        else
            this.usernameValid = "";
    }

    public String getUsernameValid() {
        return usernameValid;
    }
}
