package com.portfolio.market.project.controllers;

import com.portfolio.market.project.kafka.KafkaProducerService;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/kafka")
public class KafkaController {

    private final KafkaProducerService kafkaProducerService;


    public KafkaController(KafkaProducerService kafkaProducerService) {
        this.kafkaProducerService = kafkaProducerService;
    }

    @PostMapping("/send")
    public String sendMessage(@RequestParam String message){
        kafkaProducerService.sendMessage(message);
        return ("Message sent to kafka: " + message);
    }


}
