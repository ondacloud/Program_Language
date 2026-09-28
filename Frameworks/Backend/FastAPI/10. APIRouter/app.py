from fastapi import FastAPI, HTTPException
from fastapi import APIRouter
app = FastAPI()

router = APIRouter(prefix="/api", tags=["students"])

@router.get("/students")
def students():
    return {"students": ["Mina"]}

app.include_router(router)
