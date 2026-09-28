CREATE TABLE people (id INTEGER PRIMARY KEY, name TEXT NOT NULL, team TEXT, score INTEGER);
INSERT INTO people VALUES (1, 'Alice', 'A', 10), (2, 'Bob', 'A', 20), (3, 'Cara', 'B', 30), (4, 'Dan', NULL, NULL);
SELECT name FROM people WHERE name LIKE 'A%' ORDER BY id;
SELECT name FROM people WHERE id IN (2, 3) AND score BETWEEN 20 AND 30 ORDER BY id;
