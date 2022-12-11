package com.management.usermangement.role.infrastructure;

import com.management.usermangement.role.domain.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleMySqlRepository extends JpaRepository<Role, Long> {
}
