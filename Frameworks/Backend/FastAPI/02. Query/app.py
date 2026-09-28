from fastapi import FastAPI, HTTPException
from typing import Annotated
from fastapi import Query
app = FastAPI()

@app.get("/")
def index(limit: Annotated[int, Query(ge=1, le=100)] = 10):
    return {"limit": limit}
