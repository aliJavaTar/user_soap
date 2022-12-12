package com.management.usermanagement.user.domin;

import com.management.usermanagement.user.infrastructure.dto.UserDTO;

public interface UserRepository {
    UserDTO save(UserDTO user);

    UserDTO findById(Long id);
}
