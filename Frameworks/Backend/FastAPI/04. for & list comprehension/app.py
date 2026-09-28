from fastapi import FastAPI, HTTPException

app = FastAPI()

@app.get("/")
def index():
    return {"passed": [s for s in [60, 80, 90] if s >= 70]}
