from fastapi import FastAPI, HTTPException
from typing import Annotated
from fastapi import Path
app = FastAPI()

@app.get("/students/{student_id}")
def student(student_id: Annotated[int, Path(gt=0)]):
    return {"id": student_id}
