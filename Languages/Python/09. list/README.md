# 리스트 — 인덱스, 슬라이싱, 복사

## 핵심 개념

리스트는 순서가 있고 변경 가능한 컬렉션입니다. 서로 다른 타입도 담을 수 있지만 같은 역할의 값을 모으면 처리하기 쉽습니다.

## 실행 예제

```python
values = [10, 20, 30]
print(values[0], values[-1])
print(values[1:])
copied = values.copy()
copied.append(40)
print(values)
print(copied)
```

## 실행 결과

```text
10 30
[20, 30]
[10, 20, 30]
[10, 20, 30, 40]
```

## 동작 원리와 주의사항

인덱스 범위를 벗어나면 `IndexError`입니다. 슬라이스는 stop을 포함하지 않으며 새 리스트를 만듭니다. `b = a`는 복사가 아니라 같은 객체의 별칭입니다. `copy()`와 슬라이스는 얕은 복사이므로 중첩 객체를 공유합니다.

## 직접 확인하기

`copied = values`로 바꾸면 원본도 바뀌는지 확인하세요.

## 세부 문서

- [1차원 리스트](1-dimensional%20list/README.md)
- [2차원 리스트](2-dimensional%20list/README.md)
- [3차원 리스트](3-dimensional%20list/README.md)

---

[언어 목차](../README.md) · [이전](../08.%20function/README.md) · [다음](../10.%20lambda/README.md)

## 동봉 실행 파일과 실행 방법

각 예제는 독립적으로 실행합니다. 추가 예제는 examples 하위 폴더에 분리했습니다. 소스 파일을 수정한 뒤 다시 실행하며, 컴파일 언어는 다시 빌드하세요.

### 예제 1

이 문서와 같은 폴더에서 실행합니다.

[main.py](main.py)

```sh
python main.py
```

Python 3.10 이상을 사용합니다. 플랫폼에 따라 python 대신 python3 명령을 사용하세요.
