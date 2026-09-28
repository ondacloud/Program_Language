from flask import Flask, request, jsonify, abort

app = Flask(__name__)

@app.get("/students/<int:student_id>")
def student(student_id):
    return {"id": student_id}
