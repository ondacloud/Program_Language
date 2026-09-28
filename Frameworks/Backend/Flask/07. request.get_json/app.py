from flask import Flask, request, jsonify, abort

app = Flask(__name__)

@app.post("/")
def create():
    data = request.get_json()
    if not isinstance(data, dict) or not isinstance(data.get("name"), str) or not data["name"].strip():
        abort(400, description="name required")
    return {"name": data["name"].strip()}, 201
