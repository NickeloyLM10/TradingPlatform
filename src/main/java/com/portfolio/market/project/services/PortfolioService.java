package com.portfolio.market.project.services;

import com.portfolio.market.project.entities.Portfolio;
import com.portfolio.market.project.entities.Trader;
import com.portfolio.market.project.repositories.PortfolioRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PortfolioService {
    PortfolioRepository portfolioRepository;

    public PortfolioService(PortfolioRepository portfolioRepository) {
        this.portfolioRepository = portfolioRepository;
    }

    public Portfolio addPortfolio(Portfolio portfolio){
        return portfolioRepository.save(portfolio);
    }

    public Optional<Portfolio> getPortfolioById(Long portfolioId){
        return portfolioRepository.findById(portfolioId);
    }

    public List<Portfolio> getPortfolioByTrader(Trader trader){
        return portfolioRepository.findByTrader(trader);
    }

    public Portfolio updatePortfolio(Portfolio portfolio){
        return portfolioRepository.save(portfolio);
    }
}
