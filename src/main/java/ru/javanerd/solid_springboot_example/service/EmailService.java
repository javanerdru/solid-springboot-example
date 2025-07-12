package ru.javanerd.solid_springboot_example.service;

import org.springframework.stereotype.Service;
import ru.javanerd.solid_springboot_example.repository.entity.User;

// Single Responsibility Principle
@Service
public class EmailService {
    public void sendWelcomeEmail(User user) {
        System.out.println("Sending welcome email to " + user.getEmail());
    }
}
