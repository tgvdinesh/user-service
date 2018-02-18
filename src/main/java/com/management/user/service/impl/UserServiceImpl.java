package com.management.user.service.impl;

import com.management.user.domain.User;
import com.management.user.repository.UserRepository;
import com.management.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.validation.constraints.NotNull;
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

    @Override
    public Optional<User> getUser(int userID) {
        return Optional.of(userRepository.getOne(userID));
    }

    /**
     * Checks if user exists in ODS with username/email address with password
     *
     * @param user
     * @return
     */
    @Override
    public Optional<User> getUser(@NotNull User user) {
        if (user.getEmailAddress() == null && user.getUserName() == null) return Optional.empty();
        else if (user.getPassword() == null || user.getPassword().equalsIgnoreCase("")) return Optional.empty();
        else if (user.getUserName() != null && !user.getUserName().equalsIgnoreCase("")) {
            return Optional.empty();
        } else if (user.getUserName() != null && !user.getUserName().equalsIgnoreCase("")) {
            return Optional.empty();
        } else {
            return Optional.empty();
        }
    }
}
