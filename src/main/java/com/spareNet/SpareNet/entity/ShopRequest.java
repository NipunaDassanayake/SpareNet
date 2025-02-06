package com.spareNet.SpareNet.entity;

import jakarta.persistence.*;
import lombok.Data;
import java.util.List;

@Data
@Entity
public class ShopRequest {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long requestId;
    private Long senderShopId;
    private Long receiverShopId;
    private String requestDate;
    private String requestState;

    @ManyToMany(mappedBy = "shopRequests", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Shop> shops;
}