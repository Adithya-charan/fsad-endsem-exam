-- Create database if not exists (Note: Spring Boot might not have permissions to create the DB itself, 
-- but it will create tables inside the DB specified in application.properties)

CREATE TABLE IF NOT EXISTS shipments (
    shipment_id VARCHAR(255) PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    shipment_date VARCHAR(255) NOT NULL,
    status VARCHAR(50) NOT NULL,
    origin VARCHAR(150),
    destination VARCHAR(150),
    carrier VARCHAR(100),
    weight DOUBLE,
    description VARCHAR(255)
);
