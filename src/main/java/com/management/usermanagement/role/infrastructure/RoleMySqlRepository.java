package com.management.usermanagement.role.infrastructure;

import com.management.usermanagement.role.domain.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleMySqlRepository extends JpaRepository<RoleEntity, Long> {
}
