from flask import Flask, request, jsonify, abort
from flask import render_template
app = Flask(__name__)

@app.get("/")
def index():
    return render_template("students.html", names=["Mina", "Jin"])
