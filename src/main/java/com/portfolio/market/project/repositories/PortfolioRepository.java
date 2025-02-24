package com.portfolio.market.project.repositories;

import com.portfolio.market.project.entities.Portfolio;
import com.portfolio.market.project.entities.Trader;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PortfolioRepository extends JpaRepository<Portfolio,Long> {
    List<Portfolio> findByTrader(Trader trader);
}
