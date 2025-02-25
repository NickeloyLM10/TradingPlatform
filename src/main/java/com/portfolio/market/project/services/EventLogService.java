package com.portfolio.market.project.services;

import com.portfolio.market.project.entities.EventLog;
import com.portfolio.market.project.entities.Trader;
import com.portfolio.market.project.repositories.EventLogRepository;
import com.portfolio.market.project.repositories.TraderRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EventLogService {

    EventLogRepository eventLogRepository;

    public EventLogService(EventLogRepository eventLogRepository) {
        this.eventLogRepository = eventLogRepository;
    }

    public EventLog addEventLog(EventLog eventLog){
        return eventLogRepository.save(eventLog);
    }

    public Optional<EventLog> getEventLogById(Long eventLogId){
        return eventLogRepository.findById(eventLogId);
    }
    public List<EventLog> getProcessedFalse(){
        return eventLogRepository.findByProcessedFalse();
    }

    public void markAsProcessed(Long eventLogId){
        eventLogRepository.findById(eventLogId).ifPresent(eventLog ->{
            eventLog.setProcessed(true);
            eventLogRepository.save(eventLog);
        });
    }
}
