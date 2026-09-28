from fastapi import FastAPI, HTTPException
from typing import Annotated
from fastapi import Header, Cookie
app = FastAPI()

@app.get("/")
def index(x_course: Annotated[str | None, Header()] = None, theme: Annotated[str | None, Cookie()] = None):
    return {"course": x_course, "theme": theme}
