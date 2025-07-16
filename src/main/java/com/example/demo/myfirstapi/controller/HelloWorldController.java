package com. example.demo.myfirstapi.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Value;

import org.springframework.web.bind.annotation.RequestParam; //New import, challenge lab 2,

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController // Marks this class as a REST controller
public class HelloWorldController {
    @Value("${app.greeting.message}")
    private String customGreeting;

    @GetMapping("/hello") // Maps HTTP GET requests to the "/hello" URL
    public String sayHello() {
        return  customGreeting;
    }

    @GetMapping("/greet/{name}") // Path now matches and expects /greet/<name>, name is dynamic
    public String greetPerson(@PathVariable String name){
        return String.format("Hello %s! \n",name);
    }

    @GetMapping("/greeting")
    public String greetWithParam(
            @RequestParam(value = "name", required = false, defaultValue = "World") String name) {
        return "Hello, " + name + "!";
    }
    @GetMapping("/calculate/sum")
    public String sumNumbers( @RequestParam("num1") int number1, @RequestParam("num2") int number2) {
        int sum = number1 + number2; return "The sum of " + number1 + " and " + number2 + " is " + sum;
    }

/* Challenge Lab 3 --------------------------------------*/
    @GetMapping("/info")
    public Map<String, String> getAppInfo() {
        Map<String, String> info = new HashMap<>();
        info.put("appName", "MyFirstSpringBootAPI");
        info.put("version","nick 1.0.0");
        info.put("status" , "Running but barely");
        return info;
    }

    @GetMapping("return_info_list")
    public List<String> getFeatures(){
        return Arrays.asList("REST API- Nicholo Pardines","Spring Boot","Easy Setup and Fast Development");
    }
    /* Challenge Lab 3 --------------------------------------*/
}