from flask import Flask, request, jsonify, abort

app = Flask(__name__)

@app.errorhandler(404)
def missing(error):
    return {"error": "not_found"}, 404

@app.get("/")
def index():
    abort(404)
