package com.example.restaurant.controller;

import com.example.restaurant.service.OrderService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class OrderPageController {


    private final OrderService service;


    public OrderPageController(OrderService service){

        this.service = service;

    }


    @GetMapping("/my-orders")
    public String ordersPage(Model model){


        model.addAttribute(
                "orders",
                service.getOrders()
        );


        return "orders";

    }

}