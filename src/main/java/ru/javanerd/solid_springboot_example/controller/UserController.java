package ru.javanerd.solid_springboot_example.controller;

import org.springframework.web.bind.annotation.*;
import ru.javanerd.solid_springboot_example.repository.entity.User;
import ru.javanerd.solid_springboot_example.service.UserService;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping
    public User register(@RequestBody User user) {
        return userService.registerUser(user);
    }

    @GetMapping
    public List<User> list() {
        return userService.getAllUsers();
    }
}
