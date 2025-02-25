package com.portfolio.market.project.repositories;

import com.portfolio.market.project.entities.Portfolio;
import com.portfolio.market.project.entities.Trade;
import com.portfolio.market.project.entities.Trader;
import com.portfolio.market.project.enums.TradeStatus;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TradeRepository extends JpaRepository<Trade,Long> {
    List<Trade> findByTrader(Trader trader);
    List<Trade> findByTradeStatus(TradeStatus tradeStatus);
    List<Trade> findTradeByPortfolio(Portfolio portfolio);
}
