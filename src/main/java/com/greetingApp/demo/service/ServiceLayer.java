package com.greetingApp.demo.service;

import org.springframework.stereotype.Service;

@Service
public class ServiceLayer {
    public String meesage;
    public String getMeesage(){
        return "Hello from BridgeLabz";
    }
}
