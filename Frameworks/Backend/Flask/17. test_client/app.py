from flask import Flask, request, jsonify, abort

app = Flask(__name__)

@app.get("/")
def index():
    return {"message": "hello"}

def test_response():
    with app.test_client() as client:
        response = client.get("/")
        assert response.status_code == 200
        assert response.json == {"message": "hello"}
