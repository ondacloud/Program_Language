# dict, tuple, set 선택

## 핵심 개념

데이터를 조회하는 방식과 변경 필요성에 따라 컨테이너를 고릅니다.

## 실행 예제

```python
point = (10, 20)
x, y = point
scores = {"Alice": 90, "Bob": 80}
tags = {"python", "python", "study"}
print(x, y)
print(scores.get("Chris", 0))
print(sorted(tags))
```

## 실행 결과

```text
10 20
0
['python', 'study']
```

## 동작 원리와 주의사항

tuple은 원소 참조를 바꿀 수 없지만 내부 리스트까지 불변인 것은 아닙니다. 한 원소 튜플은 `(1,)`입니다. dict 키와 set 원소는 hashable이어야 합니다. list를 키로 쓸 수 없고, tuple도 내부에 list가 있으면 hashable이 아닙니다.

## 직접 확인하기

두 집합의 교집합 &, 합집합 |, 차집합 -를 계산하세요.

---

[언어 목차](../README.md) · [이전](../16.%20open%20file/README.md) · [다음](../18.%20comprehension/README.md)

## 동봉 실행 파일과 실행 방법

각 예제는 독립적으로 실행합니다. 추가 예제는 examples 하위 폴더에 분리했습니다. 소스 파일을 수정한 뒤 다시 실행하며, 컴파일 언어는 다시 빌드하세요.

### 예제 1

이 문서와 같은 폴더에서 실행합니다.

[main.py](main.py)

```sh
python main.py
```

Python 3.10 이상을 사용합니다. 플랫폼에 따라 python 대신 python3 명령을 사용하세요.
