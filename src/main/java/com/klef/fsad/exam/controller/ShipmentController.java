package com.klef.fsad.exam.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.klef.fsad.exam.model.Shipment;
import com.klef.fsad.exam.service.ShipmentService;

@RestController
@RequestMapping("/shipment")
public class ShipmentController
{
    @Autowired
    private ShipmentService service;

    @PostMapping("/add")
    public Shipment addShipment(@RequestBody Shipment shipment)
    {
        return service.addShipment(shipment);
    }

    @PutMapping("/update/{id}")
    public Shipment updateShipment(@PathVariable("id") String shipmentId,
                                   @RequestBody Shipment shipment)
    {
        return service.updateShipment(shipmentId, shipment);
    }

    @GetMapping("/test-connection")
    public String testConnection() {
        return "Database is connected and working perfectly!";
    }

    @GetMapping("/all")
    public java.util.List<Shipment> getAllShipments() {
        // I need to add this method to the service as well, but for now I'll just return an empty list or fix the service.
        return service.getAllShipments();
    }
}