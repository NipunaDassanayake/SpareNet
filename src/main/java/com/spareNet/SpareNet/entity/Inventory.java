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
    @Enumerated(EnumType.STRING)
    private Privacy privacy;
    private Double unitPrice;
    private Integer quantity;
    @Enumerated(EnumType.STRING)
    private VisibilityStatus visibilityStatus;

    @OneToMany(mappedBy = "inventory", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Shop> shops;

    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;

}
