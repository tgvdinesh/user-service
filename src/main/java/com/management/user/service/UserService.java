package com.management.user.service;

import com.management.user.domain.User;

import java.util.List;
import java.util.Optional;

public interface UserService {
    Optional<List<User>> getUsers();
}
