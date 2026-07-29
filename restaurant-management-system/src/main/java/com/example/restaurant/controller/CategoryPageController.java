package com.example.restaurant.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CategoryPageController {


    @GetMapping("/pizza-items")
    public String pizzaItems() {

        return "pizza-items";

    }
    @GetMapping("/indian-items")
    public String indianItems() {
        return "indian-items";
    }
    @GetMapping("/fastfood-items")
    public String fastFoodItems() {
        return "fastfood-items";
    }
    @GetMapping("/drinks")

        public String drinks()
        {
            return "drinks";
        }

}
