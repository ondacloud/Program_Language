from fastapi import FastAPI, HTTPException
from typing import Annotated
from fastapi import Depends
app = FastAPI()

def paging(limit: int = 10):
    if not 1 <= limit <= 100:
        raise HTTPException(400, "limit must be 1..100")
    return limit

@app.get("/")
def index(limit: Annotated[int, Depends(paging)]):
    return {"limit": limit}
