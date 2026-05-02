package com.klef.fsad.exam.service;

import com.klef.fsad.exam.model.Shipment;
import com.klef.fsad.exam.repository.ShipmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ShipmentServiceImpl implements ShipmentService {

    @Autowired
    private ShipmentRepository shipmentRepository;

    // -------------------------------------------------------
    // POST - Add Shipment
    // -------------------------------------------------------
    @Override
    public Shipment addShipment(Shipment shipment) {

        // Validate that shipmentId is provided manually (must not be null/blank)
        if (shipment.getShipmentId() == null || shipment.getShipmentId().trim().isEmpty()) {
            throw new IllegalArgumentException("Shipment ID must be provided manually and must not be null or empty.");
        }

        // Check for duplicate ID
        if (shipmentRepository.existsById(shipment.getShipmentId())) {
            throw new IllegalArgumentException(
                "Shipment with ID '" + shipment.getShipmentId() + "' already exists.");
        }

        return shipmentRepository.save(shipment);
    }

    // -------------------------------------------------------
    // PUT - Update Shipment
    // -------------------------------------------------------
    @Override
    public Shipment updateShipment(String shipmentId, Shipment shipmentDetails) {

        // Fetch existing record
        Shipment existing = shipmentRepository.findById(shipmentId)
            .orElseThrow(() -> new IllegalArgumentException(
                "Shipment not found with ID: " + shipmentId));

        // Update only the fields that are provided (non-null)
        if (shipmentDetails.getName() != null) {
            existing.setName(shipmentDetails.getName());
        }
        if (shipmentDetails.getShipmentDate() != null) {
            existing.setShipmentDate(shipmentDetails.getShipmentDate());
        }
        if (shipmentDetails.getStatus() != null) {
            existing.setStatus(shipmentDetails.getStatus());
        }
        if (shipmentDetails.getOrigin() != null) {
            existing.setOrigin(shipmentDetails.getOrigin());
        }
        if (shipmentDetails.getDestination() != null) {
            existing.setDestination(shipmentDetails.getDestination());
        }
        if (shipmentDetails.getCarrier() != null) {
            existing.setCarrier(shipmentDetails.getCarrier());
        }
        if (shipmentDetails.getWeight() != null) {
            existing.setWeight(shipmentDetails.getWeight());
        }
        if (shipmentDetails.getDescription() != null) {
            existing.setDescription(shipmentDetails.getDescription());
        }

        return shipmentRepository.save(existing);
    }

    @Override
    public java.util.List<Shipment> getAllShipments() {
        return shipmentRepository.findAll();
    }
}
