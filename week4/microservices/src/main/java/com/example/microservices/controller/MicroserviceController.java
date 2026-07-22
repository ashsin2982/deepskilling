package com.example.microservices.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MicroserviceController {

    @GetMapping("/")
    public String home() {
        return "Microservice is running";
    }
}