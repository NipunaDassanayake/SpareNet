package com.spareNet.SpareNet.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Products {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long productId;
    private String productName;
    private String model;
    private int quantity;
    private double unitPrice;
    private String productCondition;
    private String privacy;

    @ManyToOne
    @JoinColumn(name = "categoryId")
    private Category category;
}
