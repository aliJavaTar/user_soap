package com.management.usermangement.user.infrastructure;

import com.management.usermangement.user.domin.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class UserMySqlRepositoryImpl implements UserRepository {
    private final UserMySqlRepository mySqlRepository;
}