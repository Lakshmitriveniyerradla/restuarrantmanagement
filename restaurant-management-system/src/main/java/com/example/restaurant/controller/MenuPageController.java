package com.example.restaurant.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class MenuPageController {


    @GetMapping("/user-dashboard")
    public String menuPage(
            @RequestParam(required = false) String category,
            Model model) {


        model.addAttribute("selectedCategory", category);


        return "user-dashboard";
    }

}