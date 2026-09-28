CREATE TABLE people (id INTEGER PRIMARY KEY, name TEXT NOT NULL, team TEXT, score INTEGER);
INSERT INTO people VALUES (1, 'Alice', 'A', 10), (2, 'Bob', 'A', 20), (3, 'Cara', 'B', 30), (4, 'Dan', NULL, NULL);
SELECT name, COALESCE(score, 0) FROM people WHERE score IS NULL;
SELECT NULL = NULL, NULL IS NULL, NULLIF(5, 5);
