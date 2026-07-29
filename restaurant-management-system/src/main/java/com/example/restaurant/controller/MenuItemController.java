package com.example.restaurant.controller;

import com.example.restaurant.entity.MenuItem;
import com.example.restaurant.service.MenuItemService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/menu")
public class MenuItemController {

    private final MenuItemService service;

    public MenuItemController(MenuItemService service) {
        this.service = service;
    }

    @GetMapping
    public List<MenuItem> getAll() {
        return service.getAll();
    }

    @PostMapping
    public MenuItem add(@RequestBody MenuItem item) {
        return service.save(item);
    }

    @GetMapping("/search")
    public List<MenuItem> search(@RequestParam String keyword) {
        return service.search(keyword);
    }
}
