package com.spareNet.SpareNet.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

@Data
@Entity
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long orderId;

    private LocalDateTime orderDate;
    private Double totalAmount;

    @Enumerated(EnumType.STRING)
    private OrderStatus orderStatus;

    @ManyToOne
    @JoinColumn(name = "shopId")
    private Shop shop;

    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinTable(
            name = "order_products",
            joinColumns = @JoinColumn(name = "orderId"),
            inverseJoinColumns = @JoinColumn(name = "productId")
    )
    private List<Product> products;
}