package com.example.eurekaserver.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller {

    @GetMapping("/status")
    public String status() {
        return "Eureka Server is Running Successfully!";
    }

    @GetMapping("/hello")
    public String hello() {
        return "Hello from Eureka Server";
    }
}