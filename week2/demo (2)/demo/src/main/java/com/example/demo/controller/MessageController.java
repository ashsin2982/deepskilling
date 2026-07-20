package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.MessageService;

@RestController
public class MessageController {

    private final MessageService messageService;

    // Constructor Injection (BEST PRACTICE)
    public MessageController(MessageService messageService) {
        this.messageService = messageService;
    }

    @GetMapping("/send")
    public String send() {
        return messageService.sendMessage();
    }
}