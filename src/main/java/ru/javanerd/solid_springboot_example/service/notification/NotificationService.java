package ru.javanerd.solid_springboot_example.service.notification;

// Open/Closed Principle
interface NotificationService {
    void sendNotification(String message);
}
