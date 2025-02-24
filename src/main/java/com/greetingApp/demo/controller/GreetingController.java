package com.greetingApp.demo.controller;

import com.greetingApp.demo.model.Greeting;
import com.greetingApp.demo.service.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/greetings")
public class GreetingController {

    @Autowired
    private GreetingService greetingService;

    @GetMapping
    public ResponseEntity<Map<String, String>> getGreeting(
            @RequestParam(required = false) String firstName,
            @RequestParam(required = false) String lastName) {
        String message = greetingService.getGreeting(firstName, lastName);
        Map<String, String> response = new HashMap<>();
        response.put("message", message);
        return ResponseEntity.ok(response);
    }

    @PostMapping
    public ResponseEntity<Greeting> saveGreeting(
            @RequestParam(required = false) String firstName,
            @RequestParam(required = false) String lastName) {
        Greeting savedGreeting = greetingService.saveGreeting(firstName, lastName);
        return ResponseEntity.ok(savedGreeting);
    }

    @PutMapping
    public ResponseEntity<Map<String, String>> updateGreeting() {
        Map<String, String> response = new HashMap<>();
        response.put("message", "Greeting updated successfully");
        return ResponseEntity.ok(response);
    }

    @DeleteMapping
    public ResponseEntity<Map<String, String>> deleteGreeting() {
        Map<String, String> response = new HashMap<>();
        response.put("message", "Greeting deleted successfully");
        return ResponseEntity.ok(response);
    }
}