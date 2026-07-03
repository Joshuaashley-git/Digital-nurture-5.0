package com.cognizant.spring_learn.service;

import java.util.Date;

import javax.crypto.SecretKey;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.security.Keys;

@Service
public class JwtUtil {

    private static final Logger LOGGER = LoggerFactory.getLogger(JwtUtil.class);

    // Demo secret only -- in a real app, load from a secure config source
    private static final String SECRET = "ThisIsADemoSecretKeyForJWTSigningPurposesOnly123";

    private static final long EXPIRATION_MILLIS = 20 * 60 * 1000; // 20 minutes

    public String generateToken(String username) {
        LOGGER.debug("Entering generateToken() method for user: {}", username);

        SecretKey key = Keys.hmacShaKeyFor(SECRET.getBytes());
        Date now = new Date();
        Date expiry = new Date(now.getTime() + EXPIRATION_MILLIS);

        String token = Jwts.builder()
                .subject(username)
                .issuedAt(now)
                .expiration(expiry)
                .signWith(key)
                .compact();

        LOGGER.debug("Exiting generateToken() method");
        return token;
    }
}