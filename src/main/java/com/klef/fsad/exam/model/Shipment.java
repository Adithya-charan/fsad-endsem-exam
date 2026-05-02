package com.klef.fsad.exam.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "shipments")
public class Shipment {

    @Id
    @Column(name = "shipment_id", nullable = false, unique = true)
    private String shipmentId;

    @Column(name = "name", nullable = false, length = 100)
    private String name;

    @Column(name = "shipment_date", nullable = false)
    private String shipmentDate;

    @Column(name = "status", nullable = false, length = 50)
    private String status;

    @Column(name = "origin", length = 150)
    private String origin;

    @Column(name = "destination", length = 150)
    private String destination;

    @Column(name = "carrier", length = 100)
    private String carrier;

    @Column(name = "weight")
    private Double weight;

    @Column(name = "description", length = 255)
    private String description;

    // -------------------------------------------------------
    // Constructors
    // -------------------------------------------------------
    public Shipment() {
    }

    public Shipment(String shipmentId, String name, String shipmentDate, String status,
                    String origin, String destination, String carrier,
                    Double weight, String description) {
        this.shipmentId  = shipmentId;
        this.name        = name;
        this.shipmentDate = shipmentDate;
        this.status      = status;
        this.origin      = origin;
        this.destination = destination;
        this.carrier     = carrier;
        this.weight      = weight;
        this.description = description;
    }

    // -------------------------------------------------------
    // Getters and Setters
    // -------------------------------------------------------
    public String getShipmentId() {
        return shipmentId;
    }

    public void setShipmentId(String shipmentId) {
        this.shipmentId = shipmentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getShipmentDate() {
        return shipmentDate;
    }

    public void setShipmentDate(String shipmentDate) {
        this.shipmentDate = shipmentDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getCarrier() {
        return carrier;
    }

    public void setCarrier(String carrier) {
        this.carrier = carrier;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Shipment{" +
               "shipmentId='"  + shipmentId  + '\'' +
               ", name='"      + name        + '\'' +
               ", shipmentDate='" + shipmentDate + '\'' +
               ", status='"    + status      + '\'' +
               ", origin='"    + origin      + '\'' +
               ", destination='" + destination + '\'' +
               ", carrier='"   + carrier     + '\'' +
               ", weight="     + weight      +
               ", description='" + description + '\'' +
               '}';
    }
}
