# 데코레이터와 컨텍스트 매니저

## 핵심 개념

데코레이터는 함수를 감싸고, 컨텍스트 매니저는 진입·정리 동작을 with로 묶습니다.

## 실행 예제

```python
from functools import wraps
from contextlib import contextmanager

def traced(function):
    @wraps(function)
    def wrapper(*args, **kwargs):
        print("call", function.__name__)
        return function(*args, **kwargs)
    return wrapper

@contextmanager
def session():
    print("open")
    try:
        yield
    finally:
        print("close")

@traced
def add(a, b):
    return a + b

with session():
    print(add(2, 3))
```

## 실행 결과

```text
open
call add
5
close
```

## 동작 원리와 주의사항

@traced는 정의한 함수를 traced에 전달한 결과로 이름을 바인딩합니다. wraps는 이름·문서 등 메타데이터를 보존합니다. contextmanager의 generator는 정확히 한 번 yield해야 합니다. 정리를 finally에 두면 with 본문 예외 때도 정리 경로를 거칩니다.

## 직접 확인하기

with 본문에서 ValueError를 발생시키고 close가 출력된 뒤 예외가 전파되는지 확인하세요.

---

[언어 목차](../README.md) · [이전](../21.%20typing%20dataclass/README.md) · [다음](../23.%20testing/README.md)

## 동봉 실행 파일과 실행 방법

각 예제는 독립적으로 실행합니다. 추가 예제는 examples 하위 폴더에 분리했습니다. 소스 파일을 수정한 뒤 다시 실행하며, 컴파일 언어는 다시 빌드하세요.

### 예제 1

이 문서와 같은 폴더에서 실행합니다.

[main.py](main.py)

```sh
python main.py
```

Python 3.10 이상을 사용합니다. 플랫폼에 따라 python 대신 python3 명령을 사용하세요.
