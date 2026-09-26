# 예외 — try / except / else / finally

## 핵심 개념

실패할 수 있는 연산을 실행하고 처리 가능한 예외만 잡습니다. 정상 결과와 오류 경로를 분리합니다.

## 실행 예제

```python
def divide_text(text):
    try:
        value = int(text)
        result = 10 / value
    except ValueError:
        return "invalid integer"
    except ZeroDivisionError:
        return "zero is not allowed"
    else:
        return result

print(divide_text("2"))
print(divide_text("0"))
print(divide_text("abc"))
```

## 실행 결과

```text
5.0
zero is not allowed
invalid integer
```

## 동작 원리와 주의사항

`else`는 try에서 예외가 없을 때 실행합니다. `finally`는 정상적인 제어 흐름에서 정리에 사용하지만 프로세스 강제 종료까지 실행을 보장하지는 않습니다. `Exception`은 모든 예외의 최상위가 아니며 `KeyboardInterrupt`, `SystemExit` 등은 `BaseException`의 다른 계열입니다. 예외를 숨기는 빈 except를 피하고 재전파에는 `raise`를 사용합니다.

## 직접 확인하기

입력 "2.5"가 왜 invalid integer인지 설명하세요. int는 소수점 문자열을 직접 정수로 파싱하지 않습니다.

---

[언어 목차](../README.md) · [이전](../13.%20class/README.md) · [다음](../15.%20functions/README.md)

## 동봉 실행 파일과 실행 방법

각 예제는 독립적으로 실행합니다. 추가 예제는 examples 하위 폴더에 분리했습니다. 소스 파일을 수정한 뒤 다시 실행하며, 컴파일 언어는 다시 빌드하세요.

### 예제 1

이 문서와 같은 폴더에서 실행합니다.

[main.py](main.py)

```sh
python main.py
```

Python 3.10 이상을 사용합니다. 플랫폼에 따라 python 대신 python3 명령을 사용하세요.
