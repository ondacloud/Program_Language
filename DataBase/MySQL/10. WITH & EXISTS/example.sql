CREATE TEMPORARY TABLE scores (id INTEGER PRIMARY KEY, name VARCHAR(30) NOT NULL, team VARCHAR(10), score INTEGER);
INSERT INTO scores VALUES (1, 'Mina', 'A', 80), (2, 'Jin', 'A', 60), (3, 'Sol', 'B', 90);
CREATE TEMPORARY TABLE active_teams (team VARCHAR(10) PRIMARY KEY);
INSERT INTO active_teams VALUES ('B');
WITH high_scores AS (SELECT name, team FROM scores WHERE score >= 85) SELECT h.name FROM high_scores h WHERE EXISTS (SELECT 1 FROM active_teams a WHERE a.team = h.team) ORDER BY h.name;
