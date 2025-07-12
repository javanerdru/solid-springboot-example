package ru.javanerd.solid_springboot_example.service.notification;

import org.springframework.stereotype.Service;

@Service
public class EmailNotificationService implements NotificationService {
    public void sendNotification(String message) {
        System.out.println("Email: " + message);
    }
}
