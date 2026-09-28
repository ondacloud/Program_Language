CREATE TABLE people (id INTEGER PRIMARY KEY, name TEXT NOT NULL, team TEXT, score INTEGER);
INSERT INTO people VALUES (1, 'Alice', 'A', 10), (2, 'Bob', 'A', 20), (3, 'Cara', 'B', 30), (4, 'Dan', NULL, NULL);
CREATE INDEX idx_people_team_score ON people(team, score);
SELECT name FROM people WHERE team = 'A' AND score >= 15 ORDER BY id;
