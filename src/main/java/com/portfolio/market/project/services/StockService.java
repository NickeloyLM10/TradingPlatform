package com.portfolio.market.project.services;

import com.portfolio.market.project.entities.Portfolio;
import com.portfolio.market.project.entities.Stock;
import com.portfolio.market.project.repositories.StockRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StockService {
    StockRepository stockRepository;

    public StockService(StockRepository stockRepository) {
        this.stockRepository = stockRepository;
    }

    public Stock addStock(Stock stock){
        return stockRepository.save(stock);
    }

    public Optional<Stock> getStockById(Long stockId){
        return stockRepository.findById(stockId);
    }

    public List<Stock> getStockByPortfolio(Portfolio portfolio){
        return stockRepository.findByPortfolio(portfolio);
    }

    public Stock updateStock(Stock stock){
        return stockRepository.save(stock);
    }
}
