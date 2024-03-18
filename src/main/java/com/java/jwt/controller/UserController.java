package com.java.jwt.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/users")
public class UserController {
    @GetMapping("/user/{username}")
    public ResponseEntity<String> welcomeUser(@PathVariable String username) {
        return ResponseEntity.ok("Welcome in spring security application " + username);
    }
}
