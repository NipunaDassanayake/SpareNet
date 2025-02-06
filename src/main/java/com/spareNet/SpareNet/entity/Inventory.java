package com.spareNet.SpareNet.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
public class Inventory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long inventoryId;
    private String privacy;
    private Double unitPrice;
    private Integer quantity;
    private String visibilityStatus;

    @OneToOne
    @JoinColumn(name = "shopId")
    private Shops shop;

    @ManyToMany
    @JoinTable(
            name = "inventory_product",
            joinColumns = @JoinColumn(name = "inventoryId"), // Column for Inventory
            inverseJoinColumns = @JoinColumn(name = "productId") // Column for Products
    )
    private List<Products> products;
}
