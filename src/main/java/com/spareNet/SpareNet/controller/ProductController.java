package com.spareNet.SpareNet.controller;

import com.spareNet.SpareNet.entity.Products;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/products")
public class ProductController {
    @GetMapping
    public List<Products> getAllProducts() {
       return getAllProducts();
    }

    @PostMapping
    public void addProduct(@RequestBody Products product) {
        // Implementation here
    }

    @PutMapping("/{id}")
    public Products updateProduct(@PathVariable Long id, @RequestBody Products product) {
       return product;
    }

    @DeleteMapping("/{id}")
    public void deleteProduct(@PathVariable Long id) {
        // Implementation here
    }
}