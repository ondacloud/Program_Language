from fastapi import FastAPI, HTTPException

app = FastAPI()

@app.get("/")
def index(score: int = 80):
    if not 0 <= score <= 100:
        raise HTTPException(status_code=400, detail="score must be 0..100")
    return {"result": "pass" if score >= 70 else "retry"}
