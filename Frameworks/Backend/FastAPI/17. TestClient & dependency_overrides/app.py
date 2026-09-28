from fastapi import FastAPI, HTTPException
from typing import Annotated
from fastapi import Depends
from fastapi.testclient import TestClient
app = FastAPI()

def student_name():
    return "Mina"

@app.get("/")
def index(name: Annotated[str, Depends(student_name)]):
    return {"name": name}

def test_override():
    app.dependency_overrides[student_name] = lambda: "Test"
    try:
        with TestClient(app) as client:
            assert client.get("/").json() == {"name": "Test"}
    finally:
        app.dependency_overrides.clear()
