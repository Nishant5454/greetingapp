package com.greetingApp.demo.service;

import org.springframework.stereotype.Service;

@Service
public class ServiceLayer {
    public String meesage;
    public String getMeesage(){
        return "Hello from BridgeLabz";
    }
    public String getNameviaFirst(String firstName){
        return "Hello"+" "+firstName;
    }
    public String getNameviaLast(String lastName){
        return "Hello"+" "+lastName;
    }
    public String getNameviafirstLast(String firstName,String lastName){
        return "Hello"+" "+firstName+"  "+lastName;
    }




}
