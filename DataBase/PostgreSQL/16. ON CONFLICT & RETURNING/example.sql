CREATE TEMPORARY TABLE scores (id INTEGER PRIMARY KEY, name VARCHAR(30) NOT NULL, team VARCHAR(10), score INTEGER);
INSERT INTO scores VALUES (1, 'Mina', 'A', 80), (2, 'Jin', 'A', 60), (3, 'Sol', 'B', 90);
INSERT INTO scores VALUES (1,'Mina','A',95) ON CONFLICT (id) DO UPDATE SET score = EXCLUDED.score RETURNING id, name, score;
