# render_template

## 개념과 사용 시점

Jinja 템플릿에 데이터를 넘겨 HTML을 생성합니다. 변수 삽입은 템플릿에서 표현합니다.

## 준비와 실행

[과정 README](../README.md)의 설치를 먼저 완료합니다. 작업 폴더는 **Flask 과정 루트**입니다.

```powershell
python run.py "09. render_template/app.py"
```

서버 실행 후 다른 터미널에서 확인합니다. 요청 본문이 필요한 장은 아래 예제를 따르세요.

```powershell
curl.exe -i "http://127.0.0.1:5000/"
```

## 코드 읽기

```python
from flask import Flask, request, jsonify, abort
from flask import render_template
app = Flask(__name__)

@app.get("/")
def index():
    return render_template("students.html", names=["Mina", "Jin"])
```

[실행 파일](app.py)

## 요청·예상 결과

HTML 목록에 Mina·Jin이 나타납니다.

## 주의사항

HTML 템플릿의 기본 escaping을 유지하세요. 외부 입력에 safe 필터를 적용하지 마세요.

## 연습

빈 목록 안내를 템플릿에 추가하세요.

[과정 목차](../README.md) · [Backend 목차](../../README.md)
