from flask import Flask, request, jsonify, abort

app = Flask(__name__)

@app.get("/")
def index():
    name = request.args.get("name", "guest").strip() or "guest"
    return {"name": name}
