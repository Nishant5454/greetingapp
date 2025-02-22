package com.greetingApp.demo.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.web.bind.annotation.*;

import java.util.Map;
@RestController
@RequestMapping("/hello")

public class controller {
   private final ObjectMapper objectMapper=new ObjectMapper();
    @GetMapping("/user")// Get method to json
    public String getUser() throws JsonProcessingException {

        return "Hello"+ objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(name);
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

}
