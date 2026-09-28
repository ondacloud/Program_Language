from fastapi import FastAPI, HTTPException

app = FastAPI()

@app.get("/")
def index():
    return {"sum": 7 + 2, "passed": 80 >= 70}
