package com.management.usermanagement.user.infrastructure;

import com.management.usermanagement.user.domin.UserRepository;
import com.management.usermanagement.base.infra.config.Mapper;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

// to entity  ---> to dto
@Repository
@RequiredArgsConstructor
public class UserMySqlDAO implements UserRepository {
    private final UserMySqlRepository mySqlRepository;
    @Autowired
    private Mapper<UserEntity, UserDTO> mapper;

    @Override
    public UserDTO save(UserDTO user) {
        UserEntity userEntity = mySqlRepository.save(mapper.convertToEntity(user));
        return mapper.ConvertToDto(userEntity);
    }

    @Override
    public UserDTO findById(Long id) {
        UserEntity userEntity = mySqlRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("not found"));
        return mapper.ConvertToDto(userEntity);
    }


}
