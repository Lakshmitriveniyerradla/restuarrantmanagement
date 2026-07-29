package com.example.restaurant.controller;

import com.example.restaurant.entity.Bill;
import com.example.restaurant.repository.BillRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/bills")
public class BillingController {

    private final BillRepository repository;

    public BillingController(BillRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public List<Bill> getBills() {
        return repository.findAll();
    }

    @PostMapping
    public Bill save(@RequestBody Bill bill) {
        return repository.save(bill);
    }
}