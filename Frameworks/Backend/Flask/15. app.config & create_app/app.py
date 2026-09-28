from flask import Flask, request, jsonify, abort

app = Flask(__name__)

def create_app(testing=False):
    instance = Flask(__name__)
    instance.config.update(TESTING=testing, COURSE_LABEL="Flask")
    @instance.get("/")
    def index():
        return {"label": instance.config["COURSE_LABEL"]}
    return instance

app = create_app()
