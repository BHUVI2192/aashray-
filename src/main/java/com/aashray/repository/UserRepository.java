package com.aashray.repository;

import com.aashray.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

// This interface will handle the database operations for the 'User' class.
public interface UserRepository extends MongoRepository<User, String> {
    User findByUsername(String username); // Custom query to find a user by username
}
