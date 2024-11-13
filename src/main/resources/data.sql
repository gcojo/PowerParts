INSERT INTO category (name) VALUES ('Graphics Cards');
INSERT INTO category (name) VALUES ('Processors');
INSERT INTO category (name) VALUES ('Motherboards');
INSERT INTO category (name) VALUES ('Storage Devices');
INSERT INTO customer (name, email) VALUES ('John Doe', 'johndoe@example.com');
INSERT INTO customer (name, email) VALUES ('Jane Smith', 'janesmith@example.com');
INSERT INTO warehouse (name, location)
VALUES ('Main Warehouse', 'New York');

INSERT INTO warehouse (name, location)
VALUES ('Secondary Warehouse', 'California');
-- Assuming category_id 1 corresponds to 'Graphics Cards' and customer_id 1 corresponds to 'John Doe'
INSERT INTO product (name, price, description, stock, customer_id)
VALUES ('NVIDIA RTX 3080', 699.99, 'High-end graphics card', 100, 1);

-- Assuming category_id 2 corresponds to 'Processors' and customer_id 2 corresponds to 'Jane Smith'
INSERT INTO product (name, price, description, stock, customer_id,warehouse_id)
VALUES ('Product 1', 100.00, 'Description of Product 1', 10, 1,1);  -- Belongs to customer with id 1

INSERT INTO product (name, price, description, stock, customer_id, warehouse_id)
VALUES ('Product 2', 200.00, 'Description of Product 2', 15, 1,2);  -- Belongs to customer with id 1

INSERT INTO product (name, price, description, stock, customer_id, warehouse_id)
VALUES ('Product 3', 50.00, 'Description of Product 3', 20, 2,1);  -- Belongs to customer with id 2


