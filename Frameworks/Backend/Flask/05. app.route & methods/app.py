from flask import Flask, request, jsonify, abort

app = Flask(__name__)

@app.route("/", methods=["GET", "POST"])
def index():
    return {"method": request.method}
