package com.spareNet.SpareNet.entity;

import jakarta.persistence.*;
import lombok.Data;
import java.util.List;

@Data
@Entity
public class RequestProducts {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long requestProductId;
    private String requestDate;
    private String requestStatus;

    @ManyToOne
    @JoinColumn(name = "shopId")
    private Shops shop;

    @OneToMany(mappedBy = "requestProduct", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Products> products;
}