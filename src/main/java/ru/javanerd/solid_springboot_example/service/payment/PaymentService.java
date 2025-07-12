package ru.javanerd.solid_springboot_example.service.payment;

import org.springframework.stereotype.Service;

@Service
public class PaymentService {
    private final PaymentProcessor processor;

    public PaymentService(PaymentProcessor processor) {
        this.processor = processor;
    }

    public void pay(double amount) {
        processor.processPayment(amount);
    }
}
