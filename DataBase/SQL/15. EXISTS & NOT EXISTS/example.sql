CREATE TABLE teams (id INTEGER PRIMARY KEY, name TEXT NOT NULL);
CREATE TABLE members (id INTEGER PRIMARY KEY, name TEXT NOT NULL, team_id INTEGER);
INSERT INTO teams VALUES (1, 'A'), (2, 'B');
INSERT INTO members VALUES (1, 'Alice', 1), (2, 'Bob', NULL);
SELECT t.name FROM teams AS t
WHERE NOT EXISTS (SELECT 1 FROM members AS m WHERE m.team_id = t.id)
ORDER BY t.id;
