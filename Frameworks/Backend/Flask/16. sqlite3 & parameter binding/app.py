from flask import Flask, request, jsonify, abort
import sqlite3
from contextlib import closing
app = Flask(__name__)

@app.get("/")
def index():
    with closing(sqlite3.connect(":memory:")) as conn:
        conn.execute("CREATE TABLE students (name TEXT NOT NULL)")
        conn.execute("INSERT INTO students VALUES (?)", (request.args.get("name", "Mina"),))
        rows = conn.execute("SELECT name FROM students").fetchall()
        return {"names": [row[0] for row in rows]}
