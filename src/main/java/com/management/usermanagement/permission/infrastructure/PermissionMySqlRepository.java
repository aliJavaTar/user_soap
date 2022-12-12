package com.management.usermanagement.permission.infrastructure;

import com.management.usermanagement.permission.domin.Permission;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PermissionMySqlRepository extends JpaRepository<Permission, Long> {
}
