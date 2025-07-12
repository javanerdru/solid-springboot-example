package ru.javanerd.solid_springboot_example.service;

import org.springframework.stereotype.Service;
import ru.javanerd.solid_springboot_example.repository.UserRepository;
import ru.javanerd.solid_springboot_example.repository.entity.User;

import java.util.List;

@Service
public class UserService {
    private final UserRepository userRepository;
    private final EmailService emailService;

    public UserService(UserRepository userRepository, EmailService emailService) {
        this.userRepository = userRepository;
        this.emailService = emailService;
    }

    public User registerUser(User user) {
        User saved = userRepository.save(user);
        emailService.sendWelcomeEmail(saved);
        return saved;
    }

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }
}
