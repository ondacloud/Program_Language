from fastapi import FastAPI, HTTPException
import asyncio
app = FastAPI()

@app.get("/")
async def index():
    await asyncio.sleep(0.01)
    return {"message": "done"}
