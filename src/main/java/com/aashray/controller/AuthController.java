package com.aashray.controller;

import com.aashray.model.User;
import com.aashray.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth") // Base URL for authentication endpoints
public class AuthController {
    
    @Autowired
    private UserService userService; // Inject the UserService to handle registration and login

    // Endpoint to register a user
    @PostMapping("/register")
    public ResponseEntity<String> register(@RequestBody User user) {
        userService.registerUser(user); // Register the user
        return ResponseEntity.ok("User registered successfully");
    }

    // Endpoint to login a user
    @PostMapping("/login")
    public ResponseEntity<String> login(@RequestBody User user) {
        User existingUser = userService.loginUser(user.getUsername()); // Retrieve user by username
        if (existingUser != null && existingUser.getPassword().equals(user.getPassword())) {
            // Check if passwords match
            return ResponseEntity.ok("Login successful");
        }
        return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Invalid credentials");
    }
}
