package com.inventory.inventoryervice.controller;


import com.inventory.inventoryervice.response.EventInventoryResponse;
import com.inventory.inventoryervice.response.VenueInventoryResponse;
import com.inventory.inventoryervice.service.InventoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class InventoryController {

    private InventoryService inventoryService;

    @Autowired
    public InventoryController(InventoryService inventoryService) {
        this.inventoryService = inventoryService;
    }

    @GetMapping("/inventory/events")
    public @ResponseBody List<EventInventoryResponse> inventoryGetAllEvents() {
        return inventoryService.getAllEvents();
    }

    @GetMapping("/inventory/venueId")
    public @ResponseBody VenueInventoryResponse inventoryByVenueID(@PathVariable("venueId") Long venueId) {
        return inventoryService.getVenueInformation(venueId);
    }
}
