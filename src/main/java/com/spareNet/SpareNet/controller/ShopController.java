package com.spareNet.SpareNet.controller;

import com.spareNet.SpareNet.entity.Shop;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/shops")
public class ShopController {
    @GetMapping
    public List<Shop> getAllShops() {
return getAllShops();
    }

    @PostMapping
    public void addShop(@RequestBody Shop shop) {
        // Implementation here
    }

    @PutMapping("/{id}")
    public Shop updateShop(@PathVariable Long id, @RequestBody Shop shop) {
        return shop;
    }

    @DeleteMapping("/{id}")
    public void deleteShop(@PathVariable Long id) {
        // Implementation here
    }
}
