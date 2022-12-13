package com.management.usermanagement.user.application;

import com.management.usermanagement.role.domain.Role;
import com.management.usermanagement.user.domin.UserRepository;
import com.management.usermanagement.user.infrastructure.Username;
import com.management.usermanagement.user.infrastructure.dto.request.UserRequest;
import com.management.usermanagement.user.infrastructure.dto.respons.UserResponse;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.mock;

@SpringBootTest
class DefaultUserServiceTest {

    @Autowired
    private DefinedUserAccess userService;

    @Test
    void shouldSaveUser() {
        UserRepository watchRepository = mock(UserRepository.class);

        Username username = new Username("ali33");
        Role role = new Role("admin", null);

        UserRequest userRequest = new UserRequest(username, "id", role);

        UserResponse response = userService.save(userRequest);
        UserResponse result = new UserResponse(username, "id", role);

        assertThat(response).isEqualTo(result);

        doReturn(response).when(watchRepository).findById(1L);

    }

}