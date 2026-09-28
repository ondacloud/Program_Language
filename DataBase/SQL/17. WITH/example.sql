CREATE TABLE people (id INTEGER PRIMARY KEY, name TEXT NOT NULL, team TEXT, score INTEGER);
INSERT INTO people VALUES (1, 'Alice', 'A', 10), (2, 'Bob', 'A', 20), (3, 'Cara', 'B', 30), (4, 'Dan', NULL, NULL);
WITH totals AS (
  SELECT team, SUM(score) AS total FROM people
  WHERE team IS NOT NULL GROUP BY team
)
SELECT team, total FROM totals WHERE total >= 30 ORDER BY team;
