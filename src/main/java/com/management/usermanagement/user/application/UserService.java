package com.management.usermanagement.user.application;

import com.management.usermanagement.user.domin.User;
import com.management.usermanagement.user.infrastructure.dto.UserDTO;

public interface UserService {
    UserDTO save(UserDTO user);
}
