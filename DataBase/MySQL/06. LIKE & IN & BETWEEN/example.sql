CREATE TEMPORARY TABLE scores (id INTEGER PRIMARY KEY, name VARCHAR(30) NOT NULL, team VARCHAR(10), score INTEGER);
INSERT INTO scores VALUES (1, 'Mina', 'A', 80), (2, 'Jin', 'A', 60), (3, 'Sol', 'B', 90);
SELECT name FROM scores WHERE name LIKE 'M%' AND team IN ('A', 'B') AND score BETWEEN 70 AND 90;
