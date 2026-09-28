from fastapi import FastAPI, HTTPException
from contextlib import asynccontextmanager
app = FastAPI()

@asynccontextmanager
async def lifespan(app):
    app.state.label = "ready"
    try:
        yield
    finally:
        app.state.label = "closed"

app = FastAPI(lifespan=lifespan)

@app.get("/")
def index():
    return {"state": app.state.label}
