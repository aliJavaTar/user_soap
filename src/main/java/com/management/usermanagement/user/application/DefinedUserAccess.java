package com.management.usermanagement.user.application;

import com.management.usermanagement.user.infrastructure.dto.UserDTO;

public interface DefinedUserAccess {
    UserDTO save(UserDTO user);
}
