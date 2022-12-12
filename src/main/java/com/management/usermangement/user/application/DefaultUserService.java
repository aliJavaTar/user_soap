package com.management.usermangement.user.application;

import com.management.usermangement.user.domin.User;
import com.management.usermangement.user.infrastructure.UserMySqlDAO;
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
