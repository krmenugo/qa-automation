package com.carmen.qaautomation.controller;

import com.carmen.qaautomation.model.User;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class HelloController {
    @GetMapping("/hello")
    public String hello() {
        return "Hello Carmen 🚀";
    }
}
