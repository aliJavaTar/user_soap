package com.management.usermanagement.user.application;

import com.management.usermanagement.user.infrastructure.dto.request.UserRequest;
import com.management.usermanagement.user.infrastructure.dto.respons.UserResponse;

public interface DefinedUserAccess {
    UserResponse save(UserRequest user);
}
