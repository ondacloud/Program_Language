from fastapi import FastAPI, HTTPException
from fastapi import BackgroundTasks
app = FastAPI()

def report(name):
    print(f"processed: {name}")

@app.post("/", status_code=202)
def create(tasks: BackgroundTasks):
    tasks.add_task(report, "Mina")
    return {"accepted": True}
