package com.spareNet.SpareNet.entity;

import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDate;
import java.util.List;

@Data
@Entity
public class ShopRequest {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long requestId;

    private Long senderShopId;
    private Long receiverShopId;

    private LocalDate requestDate; // Changed from String to LocalDate

    @Enumerated(EnumType.STRING)
    private RequestState requestState; // Changed from String to ENUM

    @ManyToMany(mappedBy = "shopRequests", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Shop> shops;
}
