package com.portfolio.studentapi.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class HomeController {

    @GetMapping("/")
    public ResponseEntity<Map<String, String>> welcome() {
        Map<String, String> response = new HashMap<>();
        response.put("status", "success");
        response.put("message", "Welcome to the Spring Boot Student API!");
        response.put("documentation", "https://github.com/B3rlinSugi/springboot-student-api#readme");
        return ResponseEntity.ok(response);
    }
}
