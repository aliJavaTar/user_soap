package com.management.usermanagement.user.application;

import com.management.usermanagement.user.domin.User;
import com.management.usermanagement.user.infrastructure.UserMySqlDAO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DefaultUserService implements UserService {
    private final UserMySqlDAO userDao;


    @Override
    public User save(User user) {
        return userDao.save(user);
    }
}
