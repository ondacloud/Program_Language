CREATE TEMPORARY TABLE scores (id INTEGER PRIMARY KEY, name VARCHAR(30) NOT NULL, team VARCHAR(10), score INTEGER);
INSERT INTO scores VALUES (1, 'Mina', 'A', 80), (2, 'Jin', 'A', 60), (3, 'Sol', 'B', 90);
CREATE TEMPORARY TABLE teams (code VARCHAR(10) PRIMARY KEY, label VARCHAR(30));
INSERT INTO teams VALUES ('A','Alpha');
SELECT s.name, t.label FROM scores s LEFT JOIN teams t ON s.team = t.code ORDER BY s.id;
