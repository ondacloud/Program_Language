# sqlite3 & parameter binding

## 개념과 사용 시점

DB 입력값은 placeholder와 별도 인자로 전달합니다. 연결 자원은 context manager로 정리합니다.

## 준비와 실행

[과정 README](../README.md)의 설치를 먼저 완료합니다. 작업 폴더는 **Flask 과정 루트**입니다.

```powershell
python run.py "16. sqlite3 & parameter binding/app.py"
```

서버 실행 후 다른 터미널에서 확인합니다. 요청 본문이 필요한 장은 아래 예제를 따르세요.

```powershell
curl.exe -i "http://127.0.0.1:5000/"
```

## 코드 읽기

```python
from flask import Flask, request, jsonify, abort
import sqlite3
from contextlib import closing
app = Flask(__name__)

@app.get("/")
def index():
    with closing(sqlite3.connect(":memory:")) as conn:
        conn.execute("CREATE TABLE students (name TEXT NOT NULL)")
        conn.execute("INSERT INTO students VALUES (?)", (request.args.get("name", "Mina"),))
        rows = conn.execute("SELECT name FROM students").fetchall()
        return {"names": [row[0] for row in rows]}
```

[실행 파일](app.py)

## 요청·예상 결과

names에 입력 이름 하나 반환

## 주의사항

매 요청마다 메모리 DB를 생성하는 바인딩 실습입니다. 영구 저장이나 연결 풀 구현이 아닙니다. 식별자는 값 바인딩과 별도 처리합니다.

## 연습

작은따옴표가 포함된 이름을 저장하세요.

[과정 목차](../README.md) · [Backend 목차](../../README.md)
