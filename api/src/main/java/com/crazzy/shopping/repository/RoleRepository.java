package com.crazzy.shopping.repository;

import com.crazzy.shopping.domain.security.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role,Long> {
}
