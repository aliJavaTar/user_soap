package com.management.usermangement.user.infra;

import com.management.usermangement.user.domin.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserMySqlRepository extends JpaRepository<User, Long> {
}
