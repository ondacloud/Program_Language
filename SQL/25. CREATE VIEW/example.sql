CREATE TABLE people (id INTEGER PRIMARY KEY, name TEXT NOT NULL, team TEXT, score INTEGER);
INSERT INTO people VALUES (1, 'Alice', 'A', 10), (2, 'Bob', 'A', 20), (3, 'Cara', 'B', 30), (4, 'Dan', NULL, NULL);
CREATE VIEW active_scores AS SELECT id, name, score FROM people WHERE score IS NOT NULL;
SELECT name, score FROM active_scores WHERE score >= 20 ORDER BY id;
