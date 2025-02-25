package com.portfolio.market.project.kafka;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumerService {

    @KafkaListener(topics = "trade-events", groupId = "portfolio-trade-group")
    public void consume(String message){
        System.out.println("Reveived Message: " + message);
    }
}
