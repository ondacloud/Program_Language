# Header & Cookie

## 개념과 사용 시점

헤더와 쿠키 입력은 별도 매개변수 선언으로 읽습니다. 누락 가능성을 타입에 표현합니다.

## 준비와 실행

[과정 README](../README.md)의 설치를 먼저 완료합니다. 작업 폴더는 **FastAPI 과정 루트**입니다.

```powershell
python run.py "11. Header & Cookie/app.py"
```

서버 실행 후 다른 터미널에서 확인합니다. 요청 본문이 필요한 장은 아래 예제를 따르세요.

```powershell
curl.exe -i "http://127.0.0.1:8000/"
```

## 코드 읽기

```python
from fastapi import FastAPI, HTTPException
from typing import Annotated
from fastapi import Header, Cookie
app = FastAPI()

@app.get("/")
def index(x_course: Annotated[str | None, Header()] = None, theme: Annotated[str | None, Cookie()] = None):
    return {"course": x_course, "theme": theme}
```

[실행 파일](app.py)

## 요청·예상 결과

헤더·쿠키가 없으면 두 필드 모두 null

## 주의사항

x_course는 기본적으로 X-Course 헤더와 연결됩니다. 클라이언트가 보낸 헤더를 검증 없이 인증 정보로 신뢰하지 마세요.

## 연습

X-Course 헤더를 curl -H로 전달하세요.

[과정 목차](../README.md) · [Backend 목차](../../README.md)
