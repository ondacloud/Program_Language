from fastapi import FastAPI, HTTPException
from pydantic import BaseModel, Field
app = FastAPI()

class Student(BaseModel):
    name: str = Field(min_length=1, max_length=30)
    score: int = Field(ge=0, le=100)

@app.post("/", status_code=201)
def create(student: Student):
    return student
