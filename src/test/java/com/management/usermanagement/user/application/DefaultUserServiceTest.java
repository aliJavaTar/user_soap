package com.management.usermanagement.user.application;

import com.management.usermanagement.role.domain.Role;
import com.management.usermanagement.user.domin.User;
import com.management.usermanagement.user.domin.UserName;
import com.management.usermanagement.user.domin.UserRepository;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.mock;

@SpringBootTest
class DefaultUserServiceTest {

    @Autowired
    private UserService userService;

    @Test
    void shouldSaveUser() {
        UserRepository watchRepository = mock(UserRepository.class);
//        User user = new User("ali33");
        User user = User.createUser(new UserName("ali33"),  "12", new Role());
        User currentUser = userService.save(user);
        Assertions.assertThat(currentUser)
                .isEqualTo(User.createUser(new UserName("ali33"),  "12", new Role()));
        doReturn(user).when(watchRepository).findById(1L);

    }

}