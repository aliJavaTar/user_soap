package com.management.usermanagement.user.application;

import com.management.usermanagement.user.infrastructure.UserMySqlDAO;
import com.management.usermanagement.user.infrastructure.dto.UserDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

// verb for name in useCase ---> like save profile   just domin
@Service
@RequiredArgsConstructor
public class DefaultUserService implements UserService {
    private final UserMySqlDAO userDao;

    @Override
    public UserDTO save(UserDTO user) {
        return userDao.save(user);
    }
}
