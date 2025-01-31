package com.aashray.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    @SuppressWarnings("removal")
    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
            .csrf().disable()  // Disable CSRF for now (can be enabled based on your needs)
            .authorizeHttpRequests()  // Updated method for Spring Security 5+
                .requestMatchers("/login", "/register", "/home", "/about", "/helpdesk").permitAll()  // Public endpoints
                .requestMatchers("/admin").hasRole("ADMIN")  // Restricted to users with role ADMIN
                .anyRequest().authenticated()  // All other endpoints require authentication
            .and()
            .formLogin()
                .loginPage("/login")  // Custom login page if any
                .permitAll()  // Allow anyone to access the login page
            .and()
            .logout()
                .permitAll();  // Allow anyone to log out

        return http.build();
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();  // Password encoding with BCrypt
    }
}
