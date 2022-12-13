package com.management.usermanagement.user.application;

import com.management.usermanagement.user.infrastructure.UserMySqlDAO;
import com.management.usermanagement.user.infrastructure.dto.request.UserRequest;
import com.management.usermanagement.user.infrastructure.dto.respons.UserResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

// verb for name in useCase ---> like save profile   just domin
@Service
@RequiredArgsConstructor
public class DefinedUserAccessImpl implements DefinedUserAccess {
    private final UserMySqlDAO userDao;

    @Override
    public UserResponse save(UserRequest user) {
        return userDao.save(user);
    }


}
