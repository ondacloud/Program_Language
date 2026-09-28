CREATE TEMPORARY TABLE scores (id INTEGER PRIMARY KEY, name VARCHAR(30) NOT NULL, team VARCHAR(10), score INTEGER);
INSERT INTO scores VALUES (1, 'Mina', 'A', 80), (2, 'Jin', 'A', 60), (3, 'Sol', 'B', 90);
INSERT INTO scores VALUES (1,'Mina','A',95) AS incoming ON DUPLICATE KEY UPDATE score = incoming.score;
SELECT id, name, score FROM scores WHERE id = 1;
