CREATE TABLE students (
  id INTEGER PRIMARY KEY,
  name TEXT NOT NULL,
  score INTEGER CHECK (score BETWEEN 0 AND 100)
) STRICT;
INSERT INTO students VALUES (1, 'Alice', 90);
SELECT id, name, score FROM students;
