package com.portfolio.market.project.entities;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "stock")
public class Stock {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long stockId;

    @Column(nullable = false)
    private String stockSymbol;

    @Column(nullable = false)
    private String companyName;

    @Column(nullable = false)
    private int quantity;

    @ManyToOne
    @JoinColumn(name = "portfolioId" ,nullable = false)
    private Portfolio portfolio;

    @Column(nullable = false)
    private LocalDateTime purchasedAt;


}
