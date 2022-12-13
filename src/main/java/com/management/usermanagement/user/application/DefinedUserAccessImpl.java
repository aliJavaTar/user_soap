package com.management.usermanagement.user.application;

import com.management.usermanagement.base.infra.config.Mapper;
import com.management.usermanagement.user.domin.User;
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
    public UserResponse save(UserRequest userRequest) {
        return User.createUser(userRequest)
                .map(user -> userDao.save(Mapper.getMapper().map(user, UserRequest.class)))
                .orElseThrow(() -> new RuntimeException("can't save user"));
    }
}
