package com.example.restaurant.controller;

import com.example.restaurant.entity.CustomerOrder;
import com.example.restaurant.service.OrderService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/orders")
public class OrderController {

    private final OrderService service;

    public OrderController(OrderService service){
        this.service=service;
    }

    @GetMapping
    public List<CustomerOrder> getOrders(){
        return service.getOrders();
    }

    @PostMapping
    public CustomerOrder save(@RequestBody CustomerOrder order){
        return service.save(order);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        service.delete(id);
    }

}