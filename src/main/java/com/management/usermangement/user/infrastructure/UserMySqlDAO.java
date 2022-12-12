package com.management.usermangement.user.infrastructure;

import com.management.usermangement.user.domin.User;
import com.management.usermangement.user.domin.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class UserMySqlDAO implements UserRepository {
    private final UserMySqlRepository mySqlRepository;

    @Override
    public User save(User user) {
        return mySqlRepository.save(user);
    }
}
