package com.aashray.service;

import com.aashray.model.User;
import com.aashray.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    
    @Autowired
    private UserRepository userRepository; // This will inject the UserRepository into this service
    
    // Register a new user
    public void registerUser(User user) {
        userRepository.save(user); // Saves the user object to MongoDB
    }

    // Check if a user exists and retrieve the user by username
    public User loginUser(String username) {
        return userRepository.findByUsername(username); // Find user by username
    }
}
