package com.ticket.inventoryservice.repository;

import com.ticket.inventoryservice.model.Event;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventRepository extends JpaRepository<Event, Long> {
}
