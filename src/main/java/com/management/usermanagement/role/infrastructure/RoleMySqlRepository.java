package com.management.usermanagement.role.infrastructure;

import com.management.usermanagement.role.domain.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleMySqlRepository extends JpaRepository<Role, Long> {
}
