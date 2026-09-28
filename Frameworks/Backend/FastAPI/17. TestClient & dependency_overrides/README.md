# TestClient & dependency_overrides

## 개념과 사용 시점

테스트에서 외부 의존성을 교체하여 정상·실패 응답을 재현할 수 있습니다. override는 테스트 뒤 해제합니다.

## 준비와 실행

[과정 README](../README.md)의 설치를 먼저 완료합니다. 작업 폴더는 **FastAPI 과정 루트**입니다.

```powershell
python run.py "17. TestClient & dependency_overrides/app.py"
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
from fastapi.testclient import TestClient
app = FastAPI()

def student_name():
    return "Mina"

@app.get("/")
def index(name: Annotated[str, Depends(student_name)]):
    return {"name": name}

def test_override():
    app.dependency_overrides[student_name] = lambda: "Test"
    try:
        with TestClient(app) as client:
            assert client.get("/").json() == {"name": "Test"}
    finally:
        app.dependency_overrides.clear()
```

[실행 파일](app.py)

## 요청·예상 결과

서버 응답은 Mina. python verify.py에서는 override 테스트도 실행합니다.

## 주의사항

TestClient는 동기 테스트 API입니다. 실제 네트워크·프록시·서버 동시성은 별도 통합 검증 대상입니다.

## 연습

의존성 오류를 모사하고 상태 코드를 확인하세요.

[과정 목차](../README.md) · [Backend 목차](../../README.md)
