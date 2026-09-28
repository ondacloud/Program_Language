from fastapi import FastAPI, HTTPException
from fastapi import Request
app = FastAPI()

@app.middleware("http")
async def course_header(request: Request, call_next):
    response = await call_next(request)
    response.headers["X-Course"] = "FastAPI"
    return response

@app.get("/")
def index():
    return {"ok": True}
