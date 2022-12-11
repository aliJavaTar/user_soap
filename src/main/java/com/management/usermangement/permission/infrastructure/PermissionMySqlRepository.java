package com.management.usermangement.permission.infrastructure;

import com.management.usermangement.permission.domin.Permission;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PermissionMySqlRepository extends JpaRepository<Permission, Long> {
}
