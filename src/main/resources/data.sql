
INSERT INTO city (adress) VALUES ('123 Main St, New York, NY');
INSERT INTO city (adress) VALUES ('456 Elm St, Los Angeles, CA');
INSERT INTO city (adress) VALUES ('789 Oak St, Chicago, IL');
INSERT INTO city (adress) VALUES ('101 Maple St, Houston, TX');
INSERT INTO city (adress) VALUES ('202 Pine St, Phoenix, AZ');
INSERT INTO city (adress) VALUES ('303 Cedar St, San Francisco, CA');
INSERT INTO city (adress) VALUES ('404 Birch St, Seattle, WA');
INSERT INTO city (adress) VALUES ('505 Walnut St, Denver, CO');
INSERT INTO city (adress) VALUES ('606 Chestnut St, Miami, FL');
INSERT INTO city (adress) VALUES ('707 Spruce St, Boston, MA');


INSERT INTO warehouse (name, location, city_id)
VALUES ('Main Warehouse', 'New York', 1);
INSERT INTO warehouse (name, location, city_id)
VALUES ('Secondary Warehouse', 'California', 2);
INSERT INTO warehouse (name, location, city_id)
VALUES ('Tertiary Warehouse', 'Chicago', 3);
INSERT INTO warehouse (name, location, city_id)
VALUES ('Quaternary Warehouse', 'Houston', 4);
INSERT INTO warehouse (name, location, city_id)
VALUES ('Quinary Warehouse', 'Phoenix', 5);

INSERT INTO category (name) VALUES ('Graphics Cards');
INSERT INTO category (name) VALUES ('Processors');
INSERT INTO category (name) VALUES ('Motherboards');
INSERT INTO category (name) VALUES ('Storage Devices');
INSERT INTO category (name) VALUES ('Power Supplies');
INSERT INTO category (name) VALUES ('Cooling Systems');


INSERT INTO customer (name, email) VALUES ('John Doe', 'johndoe@example.com');
INSERT INTO customer (name, email) VALUES ('Jane Smith', 'janesmith@example.com');
INSERT INTO customer (name, email) VALUES ('Alice Johnson', 'alicejohnson@example.com');
INSERT INTO customer (name, email) VALUES ('Bob Brown', 'bobbrown@example.com');
INSERT INTO customer (name, email) VALUES ('Charlie Davis', 'charliedavis@example.com');


INSERT INTO product (name, price, description, stock, customer_id, warehouse_id)
VALUES ('NVIDIA RTX 3080', 699.99, 'High-end graphics card with 10GB GDDR6X memory', 100, 1, 1);
INSERT INTO product (name, price, description, stock, customer_id, warehouse_id)
VALUES ('Intel Core i9-13900K', 589.99, 'High-performance processor with 24 cores and 32 threads', 50, 1, 1);
INSERT INTO product (name, price, description, stock, customer_id, warehouse_id)
VALUES ('ASUS ROG Strix Z790-E', 399.99, 'Advanced gaming motherboard with Wi-Fi 6E support', 30, 1, 2);
INSERT INTO product (name, price, description, stock, customer_id, warehouse_id)
VALUES ('Samsung 980 Pro 1TB SSD', 129.99, 'High-speed NVMe M.2 SSD with PCIe 4.0 interface', 75, 2, 1);
INSERT INTO product (name, price, description, stock, customer_id, warehouse_id)
VALUES ('Corsair RM850x PSU', 149.99, '850W fully modular power supply with 80 Plus Gold certification', 40, 3, 3);
INSERT INTO product (name, price, description, stock, customer_id, warehouse_id)
VALUES ('Noctua NH-D15', 99.99, 'Premium dual-tower CPU cooler with quiet operation', 60, 4, 4);
