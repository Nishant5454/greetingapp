package com.greetingApp.demo.service;

import com.greetingApp.demo.model.Greeting;
import com.greetingApp.demo.Repository.GreetingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
@Component
public class GreetingServiceImpl implements GreetingService {

    @Autowired
    private GreetingRepository greetingRepository;

    @Override
    @Autowired
    public String getGreeting(String firstName, String lastName) {
        if (firstName != null && lastName != null) {
            return "Hello " + firstName + " " + lastName;
        } else if (firstName != null) {
            return "Hello " + firstName;
        } else if (lastName != null) {
            return "Hello " + lastName;
        }
        return "Hello World";
    }

    @Override
    public Greeting saveGreeting(String firstName, String lastName) {
        String message = getGreeting(firstName, lastName);
        Greeting greeting = new Greeting(firstName, lastName, message);
        return greetingRepository.save(greeting);
    }
}
