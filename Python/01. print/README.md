# 출력 — print와 문자열 서식

## 핵심 개념

`print(*objects, sep=" ", end="\n")`는 여러 값을 문자열로 표시합니다. 기본 구분자는 공백이고 마지막에 줄바꿈을 붙입니다.

## 실행 예제

```python
name = "Alice"
score = 95.126
print("a", "b", "c", sep="+")
print("Hello", end=" ")
print(name)
print(f"score={score:.2f}")
```

## 실행 결과

```text
a+b+c
Hello Alice
score=95.13
```

## 동작 원리와 주의사항

`format`은 print의 키워드 인수가 아닙니다. f-string, `str.format`, `%` 서식으로 먼저 문자열을 만든 다음 출력합니다. `end`는 공백 전용 옵션이 아니라 마지막에 붙일 문자열입니다. 진행 상황을 즉시 출력해야 할 때 `flush=True`를 사용할 수 있습니다.

## 직접 확인하기

`sep=" / "`와 `end="!\n"`을 사용해 a / b / c!를 출력하세요.

---

[언어 목차](../README.md) · [이전](../00.%20operator/README.md) · [다음](../02.%20if/README.md)

## 동봉 실행 파일과 실행 방법

각 예제는 독립적으로 실행합니다. 추가 예제는 examples 하위 폴더에 분리했습니다. 소스 파일을 수정한 뒤 다시 실행하며, 컴파일 언어는 다시 빌드하세요.

### 예제 1

이 문서와 같은 폴더에서 실행합니다.

[main.py](main.py)

```sh
python main.py
```

Python 3.10 이상을 사용합니다. 플랫폼에 따라 python 대신 python3 명령을 사용하세요.
