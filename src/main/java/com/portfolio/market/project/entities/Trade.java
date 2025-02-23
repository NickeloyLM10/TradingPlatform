package com.portfolio.market.project.entities;

import com.portfolio.market.project.enums.TradeType;
import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "trade")
public class Trade {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long tradeId;

    @ManyToOne
    @JoinColumn(name = "traderId", nullable = false)
    private Trader trader;

    @Column(nullable = false)
    private int quantity;

    @Column(nullable = false)
    private String companyName;

    @Column(nullable = false)
    private String stockSymbol;

    @Column(nullable = false)
    private BigDecimal price;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private TradeType tradeType;

    @Column(nullable = false)
    private LocalDateTime tradeTime;

}