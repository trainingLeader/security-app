-- CREACIÓN DE CATEGORIAS
INSERT INTO category (name, status) VALUES ('Computacion y Tecnologia', 'ENABLED');
INSERT INTO category (name, status) VALUES ('Ropa', 'ENABLED');
INSERT INTO category (name, status) VALUES ('Accesorios deportivos', 'ENABLED');
INSERT INTO category (name, status) VALUES ('Eletrodomesticos', 'ENABLED');

-- CREACIÓN DE PRODUCTOS
INSERT INTO product (name, price, status, category_id) VALUES ('Smartphone', 500.00, 'ENABLED', 1);
INSERT INTO product (name, price, status, category_id) VALUES ('Pantalla Tactil', 50.00, 'DISABLED', 1);
INSERT INTO product (name, price, status, category_id) VALUES ('Impresoras', 300.00, 'ENABLED', 1);

INSERT INTO product (name, price, status, category_id) VALUES ('Camiseta', 25.00, 'ENABLED', 2);
INSERT INTO product (name, price, status, category_id) VALUES ('Sudaderas', 35.00, 'ENABLED', 2);
INSERT INTO product (name, price, status, category_id) VALUES ('Pantalon caballero', 45.00, 'ENABLED', 2);

INSERT INTO product (name, price, status, category_id) VALUES ('Balón de Fútbol', 20.00, 'ENABLED', 3);
INSERT INTO product (name, price, status, category_id) VALUES ('Balon de baloncesto', 80.00, 'DISABLED', 3);

INSERT INTO product (name, price, status, category_id) VALUES ('Aspiradora', 120.00, 'ENABLED', 4);
INSERT INTO product (name, price, status, category_id) VALUES ('Neveras', 50.00, 'ENABLED', 4);