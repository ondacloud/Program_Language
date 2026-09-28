# BackgroundTasks

## 개념과 사용 시점

응답 후 수행할 짧은 작업을 등록합니다. 요청 응답 시간과 부가 작업을 분리할 수 있습니다.

## 준비와 실행

[과정 README](../README.md)의 설치를 먼저 완료합니다. 작업 폴더는 **FastAPI 과정 루트**입니다.

```powershell
python run.py "16. BackgroundTasks/app.py"
```

서버 실행 후 다른 터미널에서 확인합니다. 요청 본문이 필요한 장은 아래 예제를 따르세요.

```powershell
curl.exe -i "http://127.0.0.1:8000/"
```

## 코드 읽기

```python
from fastapi import FastAPI, HTTPException
from fastapi import BackgroundTasks
app = FastAPI()

def report(name):
    print(f"processed: {name}")

@app.post("/", status_code=202)
def create(tasks: BackgroundTasks):
    tasks.add_task(report, "Mina")
    return {"accepted": True}
```

[실행 파일](app.py)

## 요청·예상 결과

POST 202와 accepted=true, 서버 로그에 processed: Mina

## 주의사항

프로세스 내 작업이므로 재시작 시 유실될 수 있습니다. 중요한 작업은 내구성 있는 큐와 재시도·중복 처리 정책이 필요합니다.

## 연습

실패하는 작업의 관찰 방법을 설계하세요.

[과정 목차](../README.md) · [Backend 목차](../../README.md)
