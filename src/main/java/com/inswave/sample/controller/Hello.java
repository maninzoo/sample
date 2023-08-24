package com.inswave.sample.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {

    @Value("${sample.secret.username}")
    private String username;

    @Value("${sample.secret.password}")
    private String password;

    @GetMapping("/")
    public String base() {
        return String.format("%s: %s", username, password);
    }
}
