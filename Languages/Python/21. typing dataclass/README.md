# 타입 힌트와 dataclass

## 핵심 개념

타입 힌트는 도구와 독자를 위한 정보입니다. dataclass는 데이터 클래스의 초기화·표현·비교 코드를 생성합니다.

## 실행 예제

```python
from dataclasses import dataclass, field

@dataclass
class User:
    name: str
    tags: list[str] = field(default_factory=list)

def greet(user: User) -> str:
    return f"Hello {user.name}"

first = User("Alice")
second = User("Bob")
first.tags.append("admin")
print(greet(first))
print(second.tags)
```

## 실행 결과

```text
Hello Alice
[]
```

## 동작 원리와 주의사항

타입 힌트가 런타임 타입 검증을 자동 수행하지는 않습니다. 가변 기본값은 default_factory로 생성합니다. `frozen=True`도 내부 가변 객체까지 깊은 불변으로 만들지는 않습니다. `str | None` 표기는 Python 3.10 이상입니다.

## 직접 확인하기

선택적 이메일 필드를 추가하고 None인 경우를 처리하세요.

---

[언어 목차](../README.md) · [이전](../20.%20module%20venv/README.md) · [다음](../22.%20decorator%20context%20manager/README.md)

## 동봉 실행 파일과 실행 방법

각 예제는 독립적으로 실행합니다. 추가 예제는 examples 하위 폴더에 분리했습니다. 소스 파일을 수정한 뒤 다시 실행하며, 컴파일 언어는 다시 빌드하세요.

### 예제 1

이 문서와 같은 폴더에서 실행합니다.

[main.py](main.py)

```sh
python main.py
```

Python 3.10 이상을 사용합니다. 플랫폼에 따라 python 대신 python3 명령을 사용하세요.
