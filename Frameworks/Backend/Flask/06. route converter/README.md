# route converter

## 개념과 사용 시점

경로 변수에 int 같은 converter를 붙여 URL의 형식을 제한합니다.

## 준비와 실행

[과정 README](../README.md)의 설치를 먼저 완료합니다. 작업 폴더는 **Flask 과정 루트**입니다.

```powershell
python run.py "06. route converter/app.py"
```

서버 실행 후 다른 터미널에서 확인합니다. 요청 본문이 필요한 장은 아래 예제를 따르세요.

```powershell
curl.exe -i "http://127.0.0.1:5000/students/3"
```

## 코드 읽기

```python
from flask import Flask, request, jsonify, abort

app = Flask(__name__)

@app.get("/students/<int:student_id>")
def student(student_id):
    return {"id": student_id}
```

[실행 파일](app.py)

## 요청·예상 결과

/students/3 → {"id":3}; /students/abc → 404

## 주의사항

숫자 경로라고 해당 데이터가 존재하는 것은 아닙니다. 조회 후 리소스 존재와 권한도 검사하세요.

## 연습

음수 ID 정책을 정하세요.

[과정 목차](../README.md) · [Backend 목차](../../README.md)
