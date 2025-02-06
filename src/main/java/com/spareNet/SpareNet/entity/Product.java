package com.spareNet.SpareNet.entity;

import jakarta.persistence.*;
import lombok.Data;
import java.util.List;

@Data
@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long productId;
    private String productName;
    private String model;

    @Enumerated(EnumType.STRING)
    private ProductCondition productCondition; // Changed to ENUM

    @ManyToOne
    @JoinColumn(name = "categoryId")
    private Category category;

    @ManyToOne
    @JoinColumn(name = "inventoryId")
    private Inventory inventory;

    @ManyToMany(mappedBy = "products", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Order> orders;

    @ManyToOne
    @JoinColumn(name = "requestProductId")
    private RequestProducts requestProduct;
}
