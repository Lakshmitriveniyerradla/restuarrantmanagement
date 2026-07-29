package com.example.restaurant.service;

import com.example.restaurant.entity.CustomerOrder;
import com.example.restaurant.repository.OrderRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {

    private final OrderRepository repository;

    public OrderService(OrderRepository repository){
        this.repository=repository;
    }

    public List<CustomerOrder> getOrders(){
        return repository.findAll();
    }

    public CustomerOrder save(CustomerOrder order){
        return repository.save(order);
    }

    public void delete(Long id){
        repository.deleteById(id);
    }

}