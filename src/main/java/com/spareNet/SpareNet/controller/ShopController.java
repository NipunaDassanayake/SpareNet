package com.spareNet.SpareNet.controller;

import com.spareNet.SpareNet.entity.Shops;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/shops")
public class ShopController {
    @GetMapping
    public List<Shops> getAllShops() {
return getAllShops();
    }

    @PostMapping
    public void addShop(@RequestBody Shops shop) {
        // Implementation here
    }

    @PutMapping("/{id}")
    public Shops updateShop(@PathVariable Long id, @RequestBody Shops shop) {
        return shop;
    }

    @DeleteMapping("/{id}")
    public void deleteShop(@PathVariable Long id) {
        // Implementation here
    }
}
