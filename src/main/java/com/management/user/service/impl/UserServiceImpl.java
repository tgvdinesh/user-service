package com.management.user.service.impl;

import com.management.user.domain.User;
import com.management.user.repository.UserRepository;
import com.management.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    /**
     * This is wrong. Never allow any methods to return all records via API. This possibly gives away all records in case of hacking.
     *
     * @return Return all user data
     */
    @Override
    public Optional<List<User>> getUsers() {
        List<User> users = userRepository.findAll();
        if (users.size() == 0) return Optional.empty();
        else return Optional.of(users);
    }
}
