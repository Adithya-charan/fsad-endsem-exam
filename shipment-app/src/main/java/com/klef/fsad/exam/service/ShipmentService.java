package com.klef.fsad.exam.service;

import com.klef.fsad.exam.model.Shipment;

public interface ShipmentService {

    /**
     * Add a new shipment.
     * Throws IllegalArgumentException if shipmentId is null/blank
     * or if a shipment with the same ID already exists.
     */
    Shipment addShipment(Shipment shipment);

    /**
     * Update an existing shipment identified by shipmentId.
     * Throws IllegalArgumentException if no shipment found with the given ID.
     */
    Shipment updateShipment(String shipmentId, Shipment shipmentDetails);

    java.util.List<Shipment> getAllShipments();
}
