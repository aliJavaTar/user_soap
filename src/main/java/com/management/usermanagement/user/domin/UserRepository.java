package com.management.usermanagement.user.domin;

public interface UserRepository {
    User save(User user);

    User findById(Long id);
}
