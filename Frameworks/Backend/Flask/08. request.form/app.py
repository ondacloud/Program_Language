from flask import Flask, request, jsonify, abort

app = Flask(__name__)

@app.route("/", methods=["GET", "POST"])
def form():
    if request.method == "POST":
        return {"name": request.form.get("name", "guest")}
    return '<form method="post"><label>Name <input name="name"></label><button>Send</button></form>'
