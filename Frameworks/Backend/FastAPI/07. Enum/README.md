# Enum

## 개념과 사용 시점

Enum으로 허용된 문자열 집합을 표현하면 검증과 API 문서에 선택지가 반영됩니다.

## 준비와 실행

[과정 README](../README.md)의 설치를 먼저 완료합니다. 작업 폴더는 **FastAPI 과정 루트**입니다.

```powershell
python run.py "07. Enum/app.py"
```

서버 실행 후 다른 터미널에서 확인합니다. 요청 본문이 필요한 장은 아래 예제를 따르세요.

```powershell
curl.exe -i "http://127.0.0.1:8000/"
```

## 코드 읽기

```python
from fastapi import FastAPI, HTTPException
from enum import Enum
app = FastAPI()

class Order(str, Enum):
    asc = "asc"
    desc = "desc"

@app.get("/")
def index(order: Order = Order.asc):
    return {"order": order}
```

[실행 파일](app.py)

## 요청·예상 결과

기본 asc, order=desc는 desc, order=other는 422

## 주의사항

Enum 검증을 통과한 값도 DB 쿼리에 문자열 연결하는 대신 안전한 구조로 매핑하세요.

## 연습

정렬 대상 필드도 Enum으로 제한하세요.

[과정 목차](../README.md) · [Backend 목차](../../README.md)
