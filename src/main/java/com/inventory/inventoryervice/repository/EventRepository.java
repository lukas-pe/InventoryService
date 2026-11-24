package com.inventory.inventoryervice.repository;

import com.inventory.inventoryervice.entity.Event;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EventRepository extends JpaRepository<Event, Long> {



}
