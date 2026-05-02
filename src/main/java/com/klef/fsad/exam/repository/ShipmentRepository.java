package com.klef.fsad.exam.repository;

import com.klef.fsad.exam.model.Shipment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShipmentRepository extends JpaRepository<Shipment, String> {
    // JpaRepository provides all CRUD methods out of the box.
    // The ID type is String (shipmentId).
}
