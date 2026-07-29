package com.example.restaurant.controller;

import com.example.restaurant.entity.Payment;
import com.example.restaurant.repository.PayementRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/payments")
public class PaymentController {

    private final PayementRepository repository;

    public PaymentController(PayementRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public List<Payment> getPayments() {
        return repository.findAll();
    }

    @PostMapping
    public Payment save(@RequestBody Payment payment) {
        return repository.save(payment);
    }
}