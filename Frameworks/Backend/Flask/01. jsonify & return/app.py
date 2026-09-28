from flask import Flask, request, jsonify, abort

app = Flask(__name__)

@app.get("/")
def index():
    return jsonify(message="hello"), 200
