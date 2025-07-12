package ru.javanerd.solid_springboot_example.service.payment;

// Dependency Inversion Principle
interface PaymentProcessor {
    void processPayment(double amount);
}
