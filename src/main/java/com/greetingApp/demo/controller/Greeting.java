package com.greetingApp.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello") 
public class Greeting{
    String name;
    public String getName(){
        return name;
    }
    
}
