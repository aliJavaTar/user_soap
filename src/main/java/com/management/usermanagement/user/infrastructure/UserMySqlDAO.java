package com.management.usermanagement.user.infrastructure;

import com.management.usermanagement.role.domain.Role;
import com.management.usermanagement.role.infrastructure.RoleEntity;
import com.management.usermanagement.user.domin.UserRepository;
import com.management.usermanagement.user.infrastructure.dto.request.UserRequest;
import com.management.usermanagement.user.infrastructure.dto.respons.UserResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import static com.management.usermanagement.base.infra.config.Mapper.getMapper;

// to entity  ---> to dto
@Repository
@RequiredArgsConstructor
public class UserMySqlDAO implements UserRepository {
    private final UserMySqlRepository mySqlRepository;

    @Override
    public UserResponse save(UserRequest user) {
        Role role = user.getRole();
        RoleEntity roleEntity = getMapper().map(role, RoleEntity.class);
        UserEntity userEntity = getMapper().map(user, UserEntity.class);
        userEntity.setRole(roleEntity);
        mySqlRepository.save(userEntity);
        return getMapper().map(userEntity, UserResponse.class);

    }

    @Override
    public UserResponse findById(Long id) {
        UserEntity userEntity =
                mySqlRepository.findById(id).orElseThrow(() -> new RuntimeException("not found"));
        return getMapper().map(userEntity, UserResponse.class);
    }


}
