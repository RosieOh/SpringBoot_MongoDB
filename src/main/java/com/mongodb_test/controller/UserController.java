package com.mongodb_test.controller;

import com.mongodb_test.domain.User;
import com.mongodb_test.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/users")
public class UserController {
    private final UserService us;

    @GetMapping
    public List<User> getAllUsers() {
        return us.getAllUsers();
    }

    @PostMapping
    public User createUser(@RequestBody User u) {
        return us.createUser(u);
    }
}
