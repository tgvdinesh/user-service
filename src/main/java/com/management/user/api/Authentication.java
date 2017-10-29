package com.management.user.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Authentication is the process of getting username & password and authenticating user from a persisted source
 */
@RestController
public class Authentication {

    /**
     * @return cookie I guess
     */
    @PostMapping("/user/login")
    public String login() {
        // Connect to database first of all
        // Does the user exist in database?
        return null;
    }


    @GetMapping("/user/logout")
    public String logout() {
        return null;
    }

}
