package com.management.usermangement.permission.infrastructure;

import com.management.usermangement.permission.domin.PermissionRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class PermissionMySqlDAO implements PermissionRepository {
    private final PermissionMySqlRepository mySqlRepository;
}
