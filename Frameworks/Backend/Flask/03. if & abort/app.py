from flask import Flask, request, jsonify, abort

app = Flask(__name__)

@app.get("/")
def index():
    score = request.args.get("score", type=int)
    if score is None or not 0 <= score <= 100:
        abort(400, description="score must be 0..100")
    return {"result": "pass" if score >= 70 else "retry"}
