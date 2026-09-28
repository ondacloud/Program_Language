from fastapi import FastAPI, HTTPException
from fastapi import Response
app = FastAPI()

@app.post("/", status_code=201)
def create(response: Response):
    response.headers["Location"] = "/students/1"
    return {"id": 1}
