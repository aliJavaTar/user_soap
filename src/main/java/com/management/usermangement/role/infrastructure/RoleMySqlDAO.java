package com.management.usermangement.role.infrastructure;

import com.management.usermangement.role.domain.RoleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class RoleMySqlDAO implements RoleRepository {
    private final RoleMySqlRepository repository;
}
