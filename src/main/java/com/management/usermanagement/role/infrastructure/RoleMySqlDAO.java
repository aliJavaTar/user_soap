package com.management.usermanagement.role.infrastructure;

import com.management.usermanagement.role.domain.RoleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class RoleMySqlDAO implements RoleRepository {
    private final RoleMySqlRepository repository;
}
