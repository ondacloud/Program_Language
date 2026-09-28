from flask import Flask, request, jsonify, abort

app = Flask(__name__)

@app.get("/")
def index():
    scores = [60, 80, 90]
    return {"passed": [score for score in scores if score >= 70]}
