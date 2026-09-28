# Depends

## 개념과 사용 시점

공통 입력·자원·정책을 의존성 함수로 분리해 주입합니다. 함수 결과를 여러 경로에서 재사용할 수 있습니다.

## 준비와 실행

[과정 README](../README.md)의 설치를 먼저 완료합니다. 작업 폴더는 **FastAPI 과정 루트**입니다.

```powershell
python run.py "08. Depends/app.py"
```

서버 실행 후 다른 터미널에서 확인합니다. 요청 본문이 필요한 장은 아래 예제를 따르세요.

```powershell
curl.exe -i "http://127.0.0.1:8000/"
```

## 코드 읽기

```python
from fastapi import FastAPI, HTTPException
from typing import Annotated
from fastapi import Depends
app = FastAPI()

def paging(limit: int = 10):
    if not 1 <= limit <= 100:
        raise HTTPException(400, "limit must be 1..100")
    return limit

@app.get("/")
def index(limit: Annotated[int, Depends(paging)]):
    return {"limit": limit}
```

[실행 파일](app.py)

## 요청·예상 결과

limit=5는 5, limit=0은 400

## 주의사항

의존성 함수 자체를 Depends에 전달합니다. Depends(paging())처럼 미리 실행하지 마세요.

## 연습

공통 인증 주체를 반환하는 의존성의 역할을 설계하세요.

[과정 목차](../README.md) · [Backend 목차](../../README.md)
