package com.ticket.inventoryservice.repository;

import com.ticket.inventoryservice.model.Venue;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VenueRepository extends JpaRepository<Venue, Long> {


}
