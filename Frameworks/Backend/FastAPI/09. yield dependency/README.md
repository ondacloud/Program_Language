# yield dependency

## 개념과 사용 시점

yield 의존성으로 요청 자원을 제공하고 finally에서 정리합니다. 연결·세션 수명 관리에 사용합니다.

## 준비와 실행

[과정 README](../README.md)의 설치를 먼저 완료합니다. 작업 폴더는 **FastAPI 과정 루트**입니다.

```powershell
python run.py "09. yield dependency/app.py"
```

서버 실행 후 다른 터미널에서 확인합니다. 요청 본문이 필요한 장은 아래 예제를 따르세요.

```powershell
curl.exe -i "http://127.0.0.1:8000/"
```

## 코드 읽기

```python
from fastapi import FastAPI, HTTPException
import sqlite3
from typing import Annotated
from fastapi import Depends
app = FastAPI()

def database():
    conn = sqlite3.connect(":memory:", check_same_thread=False)
    try:
        conn.execute("CREATE TABLE students (name TEXT)")
        conn.execute("INSERT INTO students VALUES (?)", ("Mina",))
        yield conn
    finally:
        conn.close()

@app.get("/")
def index(conn: Annotated[sqlite3.Connection, Depends(database)]):
    return {"name": conn.execute("SELECT name FROM students").fetchone()[0]}
```

[실행 파일](app.py)

## 요청·예상 결과

name=Mina

## 주의사항

이 예제는 요청마다 새 메모리 DB를 만듭니다. check_same_thread=False는 동시 사용 안전성을 보장하지 않습니다. 실제 연결 풀·트랜잭션 정책은 별도로 설계하세요.

## 연습

조회 중 오류가 나도 연결이 정리되는지 확인하세요.

[과정 목차](../README.md) · [Backend 목차](../../README.md)
