package com.portfolio.market.project.services;

import com.portfolio.market.project.entities.Trader;
import com.portfolio.market.project.repositories.TraderRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class TraderService {
    TraderRepository traderRepository;

    public TraderService(TraderRepository traderRepository) {
        this.traderRepository = traderRepository;
    }

    public Trader createTrader(Trader trader){
        return traderRepository.save(trader);
    }

    public Optional<Trader> getTraderById(Long traderId){
        return traderRepository.findById(traderId);
    }

    public Optional<Trader> getTraderByEmail(String email){
        return traderRepository.findByEmail(email);
    }
}
