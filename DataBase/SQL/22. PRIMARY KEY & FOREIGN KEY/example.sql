PRAGMA foreign_keys = ON;
CREATE TABLE parent (id INTEGER PRIMARY KEY, name TEXT UNIQUE NOT NULL);
CREATE TABLE child (
  id INTEGER PRIMARY KEY,
  parent_id INTEGER NOT NULL REFERENCES parent(id),
  quantity INTEGER NOT NULL CHECK (quantity > 0)
);
INSERT INTO parent VALUES (1, 'A');
INSERT INTO child VALUES (1, 1, 2);
SELECT id, parent_id, quantity FROM child;
