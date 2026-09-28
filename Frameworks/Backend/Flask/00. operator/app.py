from flask import Flask, request, jsonify, abort

app = Flask(__name__)

@app.get("/")
def index():
    return {"sum": 7 + 2, "division": 7 / 2, "passed": 80 >= 70}
