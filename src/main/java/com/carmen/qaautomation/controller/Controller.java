package com.carmen.qaautomation.controller;

import com.carmen.qaautomation.model.User;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/users")
public class Controller {

    private static final List<User> users = new ArrayList<>(List.of(
            new User(1L, "Carmen", "carmen@test.com"),
            new User(2L, "Alex", "alex@test.com")
    ));

        @GetMapping
        public List<User> getUsers() {
            return users;
        }

        @PostMapping
        public User createUser(@RequestBody User newUser) {
            users.add(newUser);
            return newUser;
        }
}