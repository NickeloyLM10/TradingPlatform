package com.portfolio.market.project.services;

import com.portfolio.market.project.entities.Portfolio;
import com.portfolio.market.project.entities.Trade;
import com.portfolio.market.project.entities.Trader;
import com.portfolio.market.project.enums.TradeStatus;
import com.portfolio.market.project.repositories.TradeRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TradeService {
    TradeRepository tradeRepository;

    public TradeService(TradeRepository tradeRepository) {
        this.tradeRepository = tradeRepository;
    }

    public Trade createTrade(Trade trade){
        return tradeRepository.save(trade);
    }

    public Optional<Trade> getTradeById(Long TradeId){
        return tradeRepository.findById(TradeId);
    }

    public List<Trade> getTradeByPortfolio(Portfolio portfolio){
        return tradeRepository.findTradeByPortfolio(portfolio);
    }

    public List<Trade> getTradeByTrader(Trader trader){
        return tradeRepository.findByTrader(trader);
    }

    public List<Trade> findByStatus(TradeStatus tradeStatus){
        return tradeRepository.findByTradeStatus(tradeStatus);
    }


}
