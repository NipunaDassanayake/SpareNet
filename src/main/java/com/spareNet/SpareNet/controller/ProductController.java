package com.spareNet.SpareNet.controller;

import com.spareNet.SpareNet.entity.Product;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/products")
public class ProductController {
    @GetMapping
    public List<Product> getAllProducts() {
       return getAllProducts();
    }

    @PostMapping
    public void addProduct(@RequestBody Product product) {
        // Implementation here
    }

    @PutMapping("/{id}")
    public Product updateProduct(@PathVariable Long id, @RequestBody Product product) {
       return product;
    }

    @DeleteMapping("/{id}")
    public void deleteProduct(@PathVariable Long id) {
        // Implementation here
    }
}