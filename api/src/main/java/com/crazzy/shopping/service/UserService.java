package com.crazzy.shopping.service;

import com.crazzy.shopping.domain.User;
import com.crazzy.shopping.domain.security.UserRole;

import java.util.Set;

public interface UserService {

    User createUser(User user, Set<UserRole> userRoles);
}
