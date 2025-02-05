package com.spareNet.SpareNet.entity;

import jakarta.persistence.*;
import lombok.Data;

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

    @ManyToOne
    @JoinColumn(name = "productId")
    private Products product;
}
