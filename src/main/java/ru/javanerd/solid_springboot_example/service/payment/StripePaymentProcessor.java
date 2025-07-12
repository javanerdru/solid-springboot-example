package ru.javanerd.solid_springboot_example.service.payment;

import org.springframework.stereotype.Service;

@Service
public class StripePaymentProcessor implements PaymentProcessor {
    public void processPayment(double amount) {
        System.out.println("Processing payment with Stripe: $" + amount);
    }
}
