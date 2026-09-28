CREATE TABLE teams (id INTEGER PRIMARY KEY, name TEXT NOT NULL);
CREATE TABLE members (id INTEGER PRIMARY KEY, name TEXT NOT NULL, team_id INTEGER);
INSERT INTO teams VALUES (1, 'A'), (2, 'B');
INSERT INTO members VALUES (1, 'Alice', 1), (2, 'Bob', NULL);
SELECT m.name, t.name FROM members AS m
INNER JOIN teams AS t ON t.id = m.team_id ORDER BY m.id;
