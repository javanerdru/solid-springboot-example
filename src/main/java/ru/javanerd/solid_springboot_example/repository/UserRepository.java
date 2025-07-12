package ru.javanerd.solid_springboot_example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.javanerd.solid_springboot_example.repository.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
