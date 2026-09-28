from flask import Flask, request, jsonify, abort
from flask import url_for, redirect
app = Flask(__name__)

@app.get("/")
def index():
    return redirect(url_for("hello", name="Mina"))

@app.get("/hello")
def hello():
    return {"name": request.args.get("name")}
