package com.management.usermanagement.user.application;

import com.management.usermanagement.role.domain.Role;
import com.management.usermanagement.user.domin.UserRepository;
import com.management.usermanagement.user.infrastructure.dto.UserDTO;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.mock;

@SpringBootTest
class DefaultUserServiceTest {

    @Autowired
    private DefinedUserAccess userService;

    @Test
    void shouldSaveUser() {
        UserRepository watchRepository = mock(UserRepository.class);
        UserDTO userDTO = userService.save(new UserDTO("ali33", "12", new Role()));

        Assertions.assertThat(userDTO)
                .isEqualTo(new UserDTO("ali33", "12", new Role()));

        doReturn(userDTO).when(watchRepository).findById(1L);

    }

}