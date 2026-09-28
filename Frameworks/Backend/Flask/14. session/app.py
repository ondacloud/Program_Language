from flask import Flask, request, jsonify, abort
import secrets
from flask import session
app = Flask(__name__)

app.config.update(SECRET_KEY=secrets.token_hex(32), SESSION_COOKIE_HTTPONLY=True, SESSION_COOKIE_SAMESITE="Lax")

@app.post("/")
def count():
    session["count"] = session.get("count", 0) + 1
    return {"count": session["count"]}
