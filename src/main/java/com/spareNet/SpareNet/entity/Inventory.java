package com.spareNet.SpareNet.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Inventory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long inventoryId;

    @ManyToOne
    @JoinColumn(name = "productId")
    private Products product;

    private Long ownerId;
    private String visibilityStatus;
}
