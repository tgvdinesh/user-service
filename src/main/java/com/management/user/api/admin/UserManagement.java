package com.management.user.api.admin;

import com.management.user.domain.User;
import com.management.user.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/admin")
@Api(value = "/admin", description = "Administrator API operations")
public class UserManagement {
    private static final Logger LOGGER = LoggerFactory.getLogger(UserManagement.class);

    @Autowired
    private UserService userService;

    @GetMapping("/users")
    @ApiOperation(value = "Get all users", response = HttpEntity.class)
    @ApiResponses(value = {
            @ApiResponse(code = 204, message = "User not found")})
    public HttpEntity<List<User>> getUsers() {
        Optional<List<User>> users = userService.getUsers();
        return users.map(userData -> new ResponseEntity<>(userData, HttpStatus.OK)).orElseGet(() -> ResponseEntity.noContent().build());
    }
}
