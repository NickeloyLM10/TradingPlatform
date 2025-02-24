package com.portfolio.market.project.entities;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "trader")
public class Trader {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long traderId;

    @Column(nullable = false)
    private String traderName;

    @Column(nullable = false)
    private String traderPassword;

    @Column(nullable = false, unique = true)
    private String email;

    @OneToMany(mappedBy = "trader", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Portfolio> portfolios;

    @Column(nullable = false, updatable = false)
    private LocalDateTime createdAt;

    @Column
    private LocalDateTime updatedAt;

    @PrePersist
    protected void onCreate(){
        this.createdAt = LocalDateTime.now();
        this.updatedAt = LocalDateTime.now();
    }

    @PreUpdate
    protected void onUpdate(){
        this.updatedAt = LocalDateTime.now();
    }
}
