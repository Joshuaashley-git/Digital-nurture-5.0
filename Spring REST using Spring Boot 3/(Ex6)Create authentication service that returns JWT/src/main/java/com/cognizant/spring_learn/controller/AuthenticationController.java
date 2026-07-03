package com.cognizant.spring_learn.controller;

import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.spring_learn.service.JwtUtil;

@RestController
public class AuthenticationController {

    private static final Logger LOGGER = LoggerFactory.getLogger(AuthenticationController.class);

    @Autowired
    private JwtUtil jwtUtil;

    @GetMapping("/authenticate")
    public ResponseEntity<?> authenticate(@RequestHeader("Authorization") String authHeader) {
        LOGGER.debug("Entering authenticate() method");

        if (authHeader == null || !authHeader.startsWith("Basic ")) {
            LOGGER.debug("Missing or malformed Authorization header");
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).build();
        }

        String base64Credentials = authHeader.substring("Basic ".length()).trim();
        byte[] decodedBytes = Base64.getDecoder().decode(base64Credentials);
        String credentials = new String(decodedBytes, StandardCharsets.UTF_8);

        String[] values = credentials.split(":", 2);
        String username = values[0];
        String password = values.length > 1 ? values[1] : "";

        LOGGER.debug("Decoded username: {}", username);

        String token = jwtUtil.generateToken(username);

        LOGGER.debug("Exiting authenticate() method");
        return ResponseEntity.ok(Map.of("token", token));
    }
}