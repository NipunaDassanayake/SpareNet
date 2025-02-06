package com.spareNet.SpareNet.entity;

import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDate;
import java.util.List;

@Data
@Entity
public class RequestProducts {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long requestProductId;

    private LocalDate requestDate; // Changed from String to LocalDate

    @Enumerated(EnumType.STRING)
    private RequestStatus requestStatus; // Changed from String to ENUM

    @ManyToOne
    @JoinColumn(name = "shopId")
    private Shop shop;

    @OneToMany(mappedBy = "requestProduct", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Product> products;
}
