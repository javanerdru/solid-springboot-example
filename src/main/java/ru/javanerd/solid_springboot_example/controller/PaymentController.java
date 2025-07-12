package ru.javanerd.solid_springboot_example.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.javanerd.solid_springboot_example.service.payment.PaymentService;

@RestController
@RequestMapping("/api/pay")
public class PaymentController {
    private final PaymentService paymentService;

    public PaymentController(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    @PostMapping
    public void pay(@RequestParam double amount) {
        paymentService.pay(amount);
    }
}
