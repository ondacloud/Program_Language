CREATE TABLE people (id INTEGER PRIMARY KEY, name TEXT NOT NULL, team TEXT, score INTEGER);
INSERT INTO people VALUES (1, 'Alice', 'A', 10), (2, 'Bob', 'A', 20), (3, 'Cara', 'B', 30), (4, 'Dan', NULL, NULL);
SELECT name,
  CASE WHEN score IS NULL THEN 'missing'
       WHEN score >= 20 THEN 'pass'
       ELSE 'retry' END AS result
FROM people ORDER BY id;
