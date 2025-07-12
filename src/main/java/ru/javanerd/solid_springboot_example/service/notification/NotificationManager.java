package ru.javanerd.solid_springboot_example.service.notification;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NotificationManager {
    private final List<NotificationService> services;

    public NotificationManager(List<NotificationService> services) {
        this.services = services;
    }

    public void notifyAll(String message) {
        services.forEach(service -> service.sendNotification(message));
    }
}
