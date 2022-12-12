package com.management.usermanagement.permission.infrastructure;

import com.management.usermanagement.permission.domin.PermissionRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class PermissionMySqlDAO implements PermissionRepository {
    private final PermissionMySqlRepository mySqlRepository;
}
