package com.management.usermanagement.user.domin;

import com.management.usermanagement.user.infrastructure.dto.request.UserRequest;
import com.management.usermanagement.user.infrastructure.dto.respons.UserResponse;

public interface UserRepository {
    UserResponse save(UserRequest user);

    UserResponse findById(Long id);
}
