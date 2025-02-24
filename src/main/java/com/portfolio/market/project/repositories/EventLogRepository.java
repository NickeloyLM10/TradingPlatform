package com.portfolio.market.project.repositories;

import com.portfolio.market.project.entities.EventLog;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EventLogRepository extends JpaRepository<EventLog, Long> {
    List<EventLog> findByProcessedFalse();
}
