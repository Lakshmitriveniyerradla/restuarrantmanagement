package com.example.restaurant.controller;

import com.example.restaurant.entity.CustomerOrder;
import com.example.restaurant.entity.OrderItem;
import com.example.restaurant.repository.OrderRepository;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;


@Controller
@RequestMapping("/orders")
public class OrderController {


    private final OrderRepository orderRepository;


    public OrderController(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }



    @PostMapping("/create")
    public String createOrder(@ModelAttribute CustomerOrder order) {


        order.setStatus("PENDING");

        order.setOrderDate(LocalDateTime.now());


        // TEMPORARY TEST ITEM
        // Later we replace this with cart items

        OrderItem item = new OrderItem();


        item.setQuantity(1);

        item.setPrice(10.0);



        List<OrderItem> items = new ArrayList<>();

        items.add(item);


        order.setItems(items);


        order.setTotalAmount(10.0);



        orderRepository.save(order);



        return "redirect:/payment";

    }




    @GetMapping
    public String getOrders(Model model) {


        List<CustomerOrder> orders =
                orderRepository.findAll();


        model.addAttribute("orders", orders);


        return "orders";

    }

}