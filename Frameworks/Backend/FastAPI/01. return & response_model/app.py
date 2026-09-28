from fastapi import FastAPI, HTTPException
from pydantic import BaseModel
app = FastAPI()

class PublicStudent(BaseModel):
    name: str

@app.get("/", response_model=PublicStudent)
def index():
    return {"name": "Mina", "internal_note": "not public"}
