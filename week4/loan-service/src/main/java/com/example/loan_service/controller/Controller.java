package com.example.loan_service.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/loan")
    public String getLoan() {
        return "Loan Microservice is Running";
    }
}