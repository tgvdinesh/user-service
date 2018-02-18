package com.management.user.service.impl;

import com.management.user.domain.CustomUserDetails;
import com.management.user.domain.User;
import com.management.user.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserDetailServiceImpl implements UserDetailsService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
        Optional<User> optionalUser = userRepository.findByUserName(userName);

        if (optionalUser.isPresent()) {
            return new CustomUserDetails(optionalUser.get());
        } else {
            throw new UsernameNotFoundException(userName + " not found!");
        }
    }
}