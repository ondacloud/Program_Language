from fastapi import FastAPI, HTTPException
import sqlite3
from typing import Annotated
from fastapi import Depends
app = FastAPI()

def database():
    conn = sqlite3.connect(":memory:", check_same_thread=False)
    try:
        conn.execute("CREATE TABLE students (name TEXT)")
        conn.execute("INSERT INTO students VALUES (?)", ("Mina",))
        yield conn
    finally:
        conn.close()

@app.get("/")
def index(conn: Annotated[sqlite3.Connection, Depends(database)]):
    return {"name": conn.execute("SELECT name FROM students").fetchone()[0]}
