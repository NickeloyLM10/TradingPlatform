package com.portfolio.market.project.repositories;

import com.portfolio.market.project.entities.Portfolio;
import com.portfolio.market.project.entities.Stock;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StockRepository extends JpaRepository<Stock,Long> {
    List<Stock> findByPortfolio(Portfolio portfolio);
}
