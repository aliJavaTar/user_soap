package com.management.usermanagement.user.infrastructure;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMySqlRepository extends JpaRepository<UserEntity, Long> {
}
