# return & response_model

## 개념과 사용 시점

response_model로 응답 계약을 정합니다. 반환 데이터 검증과 출력 필터링에 사용됩니다.

## 준비와 실행

[과정 README](../README.md)의 설치를 먼저 완료합니다. 작업 폴더는 **FastAPI 과정 루트**입니다.

```powershell
python run.py "01. return & response_model/app.py"
```

서버 실행 후 다른 터미널에서 확인합니다. 요청 본문이 필요한 장은 아래 예제를 따르세요.

```powershell
curl.exe -i "http://127.0.0.1:8000/"
```

## 코드 읽기

```python
from fastapi import FastAPI, HTTPException
from pydantic import BaseModel
app = FastAPI()

class PublicStudent(BaseModel):
    name: str

@app.get("/", response_model=PublicStudent)
def index():
    return {"name": "Mina", "internal_note": "not public"}
```

[실행 파일](app.py)

## 요청·예상 결과

응답에는 name만 포함됩니다.

## 주의사항

응답 필터링을 인증·권한 검사 대신 사용하지 마세요. 로그나 다른 경로에서는 내부 값이 노출될 수 있습니다.

## 연습

score 필드를 응답 모델에 추가하세요.

[과정 목차](../README.md) · [Backend 목차](../../README.md)
