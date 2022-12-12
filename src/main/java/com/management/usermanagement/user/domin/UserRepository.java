package com.management.usermanagement.user.domin;

import com.management.usermanagement.user.infrastructure.UserDTO;

public interface UserRepository {
    UserDTO save(UserDTO user);

    UserDTO findById(Long id);
}
