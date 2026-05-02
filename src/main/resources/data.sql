-- Sample data for shipments
INSERT IGNORE INTO shipments (shipment_id, name, shipment_date, status, origin, destination, carrier, weight, description)
VALUES ('SH101', 'Sample Package', '2023-12-01', 'DELIVERED', 'Hyderabad', 'Bangalore', 'BlueDart', 2.5, 'Test Shipment');

INSERT IGNORE INTO shipments (shipment_id, name, shipment_date, status, origin, destination, carrier, weight, description)
VALUES ('SH102', 'Office Supplies', '2023-12-05', 'IN_TRANSIT', 'Mumbai', 'Delhi', 'Delhivery', 10.0, 'Bulk paper and pens');

INSERT IGNORE INTO shipments (shipment_id, name, shipment_date, status, origin, destination, carrier, weight, description)
VALUES ('SH103', 'Gaming Laptop', '2023-12-08', 'PENDING', 'Chennai', 'Pune', 'FedEx', 3.5, 'High-end gaming laptop');

INSERT IGNORE INTO shipments (shipment_id, name, shipment_date, status, origin, destination, carrier, weight, description)
VALUES ('SH104', 'Winter Jackets', '2023-12-10', 'IN_TRANSIT', 'Shimla', 'Kolkata', 'Ecom Express', 15.2, 'Seasonal clothing batch');

INSERT IGNORE INTO shipments (shipment_id, name, shipment_date, status, origin, destination, carrier, weight, description)
VALUES ('SH105', 'Smartphones', '2023-12-12', 'SHIPPED', 'Gurgaon', 'Ahmedabad', 'DHL', 1.2, 'Fragile electronic items');

