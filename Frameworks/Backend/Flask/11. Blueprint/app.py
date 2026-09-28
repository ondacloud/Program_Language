from flask import Flask, request, jsonify, abort
from flask import Blueprint
app = Flask(__name__)

api = Blueprint("students", __name__, url_prefix="/api")

@api.get("/students")
def students():
    return {"students": ["Mina"]}

app.register_blueprint(api)
