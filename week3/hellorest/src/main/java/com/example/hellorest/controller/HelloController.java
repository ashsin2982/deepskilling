package com.example.hellorest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String home() {
        return "Welcome to Spring Boot 3";
    }

    @GetMapping("/hello")
    public String hello() {
        return "Hello World RESTful Web Service!";
    }
}