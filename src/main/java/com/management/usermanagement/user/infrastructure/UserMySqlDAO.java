package com.management.usermanagement.user.infrastructure;

import com.management.usermanagement.config.Mapper;
import com.management.usermanagement.user.domin.User;
import com.management.usermanagement.user.domin.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
// to entity  ---> to dto
@Repository
@RequiredArgsConstructor
public class UserMySqlDAO implements UserRepository {
    private final UserMySqlRepository mySqlRepository;
    private final Mapper map;

    @Override
    public User save(User user) {
        UserEntity userEntity = mySqlRepository.save(map.modelMapper().map(user, UserEntity.class));
        return map.modelMapper().map(userEntity, User.class);
    }

    @Override
    public User findById(Long id) {
        UserEntity userEntity = mySqlRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("not found"));
        return map.modelMapper().map(userEntity, User.class);
    }
}
