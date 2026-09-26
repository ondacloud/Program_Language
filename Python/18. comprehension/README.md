# 컴프리헨션

## 핵심 개념

순회·변환·필터링을 하나의 표현식으로 작성합니다.

## 실행 예제

```python
numbers = [1, 2, 3, 4]
squares = [n * n for n in numbers if n % 2 == 0]
mapping = {n: n * n for n in numbers}
print(squares)
print(mapping[3])
```

## 실행 결과

```text
[4, 16]
9
```

## 동작 원리와 주의사항

list, dict, set 컴프리헨션은 결과를 즉시 만듭니다. `(n * n for n in numbers)`는 generator 표현식으로 지연 평가합니다. 중첩과 조건이 많아지면 일반 반복문으로 풀어 쓰세요.

## 직접 확인하기

문자열 목록에서 빈 문자열을 빼고 모두 소문자로 변환하세요.

---

[언어 목차](../README.md) · [이전](../17.%20dict%20tuple%20set/README.md) · [다음](../19.%20iterator%20generator/README.md)

## 동봉 실행 파일과 실행 방법

각 예제는 독립적으로 실행합니다. 추가 예제는 examples 하위 폴더에 분리했습니다. 소스 파일을 수정한 뒤 다시 실행하며, 컴파일 언어는 다시 빌드하세요.

### 예제 1

이 문서와 같은 폴더에서 실행합니다.

[main.py](main.py)

```sh
python main.py
```

Python 3.10 이상을 사용합니다. 플랫폼에 따라 python 대신 python3 명령을 사용하세요.
