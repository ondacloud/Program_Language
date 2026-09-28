# BaseModel & Field

## 개념과 사용 시점

Pydantic 모델로 JSON 본문의 구조와 필드 제약을 정의합니다.

## 준비와 실행

[과정 README](../README.md)의 설치를 먼저 완료합니다. 작업 폴더는 **FastAPI 과정 루트**입니다.

```powershell
python run.py "06. BaseModel & Field/app.py"
```

서버 실행 후 다른 터미널에서 확인합니다. 요청 본문이 필요한 장은 아래 예제를 따르세요.

```powershell
curl.exe -i "http://127.0.0.1:8000/"
```

## 코드 읽기

```python
from fastapi import FastAPI, HTTPException
from pydantic import BaseModel, Field
app = FastAPI()

class Student(BaseModel):
    name: str = Field(min_length=1, max_length=30)
    score: int = Field(ge=0, le=100)

@app.post("/", status_code=201)
def create(student: Student):
    return student
```

[실행 파일](app.py)

## 요청·예상 결과

POST {"name":"Mina","score":80} → 201. PowerShell:
```powershell
Invoke-RestMethod http://127.0.0.1:8000/ -Method Post -ContentType application/json -Body '{"name":"Mina","score":80}'
```
GET은 405입니다.

## 주의사항

기본 타입 변환 정책을 이해하세요. 엄격한 타입이 필요하면 strict 설정을 검토합니다. 공백 이름은 별도 규칙이 필요합니다.

## 연습

field_validator로 이름을 trim하고 공백 이름을 거절하세요.

[과정 목차](../README.md) · [Backend 목차](../../README.md)
