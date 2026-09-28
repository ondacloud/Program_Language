from fastapi import FastAPI, HTTPException
from enum import Enum
app = FastAPI()

class Order(str, Enum):
    asc = "asc"
    desc = "desc"

@app.get("/")
def index(order: Order = Order.asc):
    return {"order": order}
