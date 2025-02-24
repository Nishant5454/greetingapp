package com.greetingApp.demo.service;

import com.greetingApp.demo.model.Greeting;

public interface GreetingService {
    String getGreeting(String firstName, String lastName);
    Greeting saveGreeting(String firstName, String lastName);
}