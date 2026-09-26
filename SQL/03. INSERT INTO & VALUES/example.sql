CREATE TABLE items (id INTEGER PRIMARY KEY, name TEXT NOT NULL, quantity INTEGER DEFAULT 0);
INSERT INTO items (id, name) VALUES (1, 'pen');
INSERT INTO items (id, name, quantity) VALUES (2, 'book', 3);
SELECT id, name, quantity FROM items ORDER BY id;
