CREATE TEMPORARY TABLE scores (id INTEGER PRIMARY KEY, name VARCHAR(30) NOT NULL, team VARCHAR(10), score INTEGER);
INSERT INTO scores VALUES (1, 'Mina', 'A', 80), (2, 'Jin', 'A', 60), (3, 'Sol', 'B', 90);
SELECT name, CASE WHEN score >= 85 THEN 'high' WHEN score >= 70 THEN 'middle' ELSE 'low' END AS grade FROM scores ORDER BY id;
