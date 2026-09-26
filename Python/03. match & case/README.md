# 패턴 매칭 — match / case

## 핵심 개념

Python 3.10 이상에서 값의 구조를 패턴으로 분해합니다. 단순한 값 비교 외에 시퀀스, 매핑, 클래스 패턴을 사용할 수 있습니다.

## 실행 예제

```python
command = ["move", 3, 4]
match command:
    case ["move", x, y] if x >= 0 and y >= 0:
        print(f"move to {x}, {y}")
    case ["stop"]:
        print("stop")
    case _:
        print("unknown")
```

## 실행 결과

```text
move to 3, 4
```

## 동작 원리와 주의사항

`case _`는 나머지를 처리하는 와일드카드이며 마지막에 둡니다. `case name` 같은 맨 이름은 기존 변수와 비교하지 않고 값을 바인딩하는 캡처 패턴입니다. 첫 번째로 일치하고 가드까지 참인 분기를 실행하며 fall-through는 없습니다.

## 직접 확인하기

command를 ["move", -1, 4]로 바꾸세요. 가드가 거짓이므로 unknown입니다.

---

[언어 목차](../README.md) · [이전](../02.%20if/README.md) · [다음](../04.%20for/README.md)

## 동봉 실행 파일과 실행 방법

각 예제는 독립적으로 실행합니다. 추가 예제는 examples 하위 폴더에 분리했습니다. 소스 파일을 수정한 뒤 다시 실행하며, 컴파일 언어는 다시 빌드하세요.

### 예제 1

이 문서와 같은 폴더에서 실행합니다.

[main.py](main.py)

```sh
python main.py
```

Python 3.10 이상을 사용합니다. 플랫폼에 따라 python 대신 python3 명령을 사용하세요.
