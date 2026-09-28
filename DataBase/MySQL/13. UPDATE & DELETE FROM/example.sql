CREATE TEMPORARY TABLE scores (id INTEGER PRIMARY KEY, name VARCHAR(30) NOT NULL, team VARCHAR(10), score INTEGER);
INSERT INTO scores VALUES (1, 'Mina', 'A', 80), (2, 'Jin', 'A', 60), (3, 'Sol', 'B', 90);
UPDATE scores SET score = score + 5 WHERE id = 2;
DELETE FROM scores WHERE id = 3;
SELECT name, score FROM scores ORDER BY id;
