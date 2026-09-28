from flask import Flask, request, jsonify, abort
from flask import g
app = Flask(__name__)

@app.before_request
def begin():
    g.label = "course"

@app.after_request
def finish(response):
    response.headers["X-Course"] = g.label
    return response

@app.get("/")
def index():
    return {"ok": True}
