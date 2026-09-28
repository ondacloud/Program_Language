# if & HTTPException

## 개념과 사용 시점

조건 검사 실패를 HTTPException으로 표현합니다. raise해야 요청 흐름이 중단됩니다.

## 준비와 실행

[과정 README](../README.md)의 설치를 먼저 완료합니다. 작업 폴더는 **FastAPI 과정 루트**입니다.

```powershell
python run.py "03. if & HTTPException/app.py"
```

서버 실행 후 다른 터미널에서 확인합니다. 요청 본문이 필요한 장은 아래 예제를 따르세요.

```powershell
curl.exe -i "http://127.0.0.1:8000/"
```

## 코드 읽기

```python
from fastapi import FastAPI, HTTPException

app = FastAPI()

@app.get("/")
def index(score: int = 80):
    if not 0 <= score <= 100:
        raise HTTPException(status_code=400, detail="score must be 0..100")
    return {"result": "pass" if score >= 70 else "retry"}
```

[실행 파일](app.py)

## 요청·예상 결과

score=80은 pass, 101은 400

## 주의사항

예외 객체를 return하면 의도한 오류 응답이 아닙니다.

## 연습

0·70·100 경계값을 확인하세요.

[과정 목차](../README.md) · [Backend 목차](../../README.md)
