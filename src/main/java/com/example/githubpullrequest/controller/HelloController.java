package com.example.githubpullrequest.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/hello")
    public ResponseEntity<?> hello() {
        return ResponseEntity.ofNullable("hello");
    }
}
