package ru.javanerd.solid_springboot_example.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.javanerd.solid_springboot_example.service.notification.NotificationManager;

@RestController
@RequestMapping("/api/notify")
public class NotificationController {
    private final NotificationManager notificationManager;

    public NotificationController(NotificationManager notificationManager) {
        this.notificationManager = notificationManager;
    }

    @PostMapping
    public void notifyAll(@RequestBody String message) {
        notificationManager.notifyAll(message);
    }
}
