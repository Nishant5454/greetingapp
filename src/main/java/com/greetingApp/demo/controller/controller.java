package com.greetingApp.demo.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.greetingApp.demo.service.ServiceLayer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;
@RestController
@RequestMapping("/hello")

public class controller {
   private final ObjectMapper objectMapper=new ObjectMapper();

    public controller(ServiceLayer service) {
        this.service = service;
    }

    @GetMapping("/user")// Get method to json
    public String getUser() throws JsonProcessingException {
        return "Hello User";
    }
    @PostMapping("/user/post")
    public String postUser(@RequestBody Greeting greeting) throws JsonProcessingException {
        Map<String,String>result=Map.of("message","Welcome "+greeting.getName());
         return objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(result);
        //return "Welcome to our page "+postResult;

    }
    @PutMapping("/user/put")
    public String putUser(@RequestBody Greeting greeting)throws JsonProcessingException{
        //name=name.trim();
        return objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(greeting.getName())+" is updated";
    }
    @DeleteMapping("/user/delete")
    public String deleteUser(@RequestBody Greeting greeting)throws JsonProcessingException{
        //name=name.trim();
        return objectMapper.writeValueAsString(greeting.getName())+" is deleted from the Database";
    }
    private ServiceLayer service;
    @Autowired
    public void GreetingController(ServiceLayer service){
        this.service=service;
    }
    @GetMapping("/service")
    public String getGreeting(){
        return service.getMeesage();
    }


}
