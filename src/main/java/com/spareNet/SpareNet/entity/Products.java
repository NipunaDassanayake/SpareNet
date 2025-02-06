package com.spareNet.SpareNet.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
public class Products {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long productId;
    private String productName;
    private String model;
    private String productCondition;

    @ManyToOne
    @JoinColumn(name = "categoryId")
    private Category category;

    @ManyToMany(mappedBy = "products")
    private List<Inventory> inventories;

    @ManyToMany(mappedBy = "products", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Order> orders;

    @ManyToOne
    @JoinColumn(name = "requestProductId")
    private RequestProducts requestProduct;
}