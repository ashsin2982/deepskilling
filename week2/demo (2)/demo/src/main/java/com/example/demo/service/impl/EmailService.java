package com.example.demo.service.impl;

import org.springframework.stereotype.Service;
import com.example.demo.service.MessageService;

@Service
public class EmailService implements MessageService {

    @Override
    public String sendMessage() {
        return "Message sent via Email Service!";
    }
}