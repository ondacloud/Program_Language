CREATE TEMPORARY TABLE scores (id INTEGER PRIMARY KEY, name VARCHAR(30) NOT NULL, team VARCHAR(10), score INTEGER);
INSERT INTO scores VALUES (1, 'Mina', 'A', 80), (2, 'Jin', 'A', 60), (3, 'Sol', 'B', 90);
SELECT team, COUNT(*) AS members, SUM(score) AS total, AVG(score) AS average FROM scores GROUP BY team HAVING COUNT(*) >= 2 ORDER BY team;
