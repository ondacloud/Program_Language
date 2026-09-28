# lifespan

## 개념과 사용 시점

lifespan context manager로 앱 시작·종료 자원을 관리합니다. 테스트에서도 수명을 실제로 열어야 startup 코드가 실행됩니다.

## 준비와 실행

[과정 README](../README.md)의 설치를 먼저 완료합니다. 작업 폴더는 **FastAPI 과정 루트**입니다.

```powershell
python run.py "14. lifespan/app.py"
```

서버 실행 후 다른 터미널에서 확인합니다. 요청 본문이 필요한 장은 아래 예제를 따르세요.

```powershell
curl.exe -i "http://127.0.0.1:8000/"
```

## 코드 읽기

```python
from fastapi import FastAPI, HTTPException
from contextlib import asynccontextmanager
app = FastAPI()

@asynccontextmanager
async def lifespan(app):
    app.state.label = "ready"
    try:
        yield
    finally:
        app.state.label = "closed"

app = FastAPI(lifespan=lifespan)

@app.get("/")
def index():
    return {"state": app.state.label}
```

[실행 파일](app.py)

## 요청·예상 결과

state=ready

## 주의사항

프로세스가 여러 개면 각 프로세스마다 startup 자원이 만들어집니다. 전역 단일 실행이라고 가정하지 마세요.

## 연습

모델 로딩이나 연결 풀 초기화 위치를 설계하세요.

[과정 목차](../README.md) · [Backend 목차](../../README.md)
