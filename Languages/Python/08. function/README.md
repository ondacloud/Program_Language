# 함수 — 인수, 반환값, 기본값

## 핵심 개념

`def`는 함수 객체를 정의합니다. 인수를 받아 값을 반환하며 `return`을 생략하면 `None`을 반환합니다.

## 실행 예제

```python
def add_item(item, items=None):
    if items is None:
        items = []
    items.append(item)
    return items

def greet(name, *, prefix="Hello"):
    return f"{prefix}, {name}"

print(add_item("a"))
print(add_item("b"))
print(greet("Alice", prefix="Hi"))
```

## 실행 결과

```text
['a']
['b']
Hi, Alice
```

## 동작 원리와 주의사항

- 기본 인수는 호출할 때마다가 아니라 함수 정의 시 한 번 평가됩니다. `items=[]`를 사용하면 호출끼리 리스트를 공유합니다.
- `*` 뒤 매개변수는 키워드로 전달합니다. `*args`는 위치 인수를 튜플로, `**kwargs`는 키워드 인수를 딕셔너리로 받습니다.
- 함수는 객체에 대한 참조를 전달받습니다. 리스트를 변경하면 호출자도 보지만 매개변수 이름을 다른 객체에 재대입하는 것은 호출자 이름을 바꾸지 않습니다.
- 여러 값은 `return a, b`로 튜플을 반환하고 `a, b = func()`로 풀어 받을 수 있습니다.

## 직접 확인하기

빈 리스트를 직접 전달했을 때도 같은 리스트에 원소가 추가되는지 확인하세요. `if not items`와 `if items is None`의 차이도 설명하세요.

---

[언어 목차](../README.md) · [이전](../07.%20continue/README.md) · [다음](../09.%20list/README.md)

## 동봉 실행 파일과 실행 방법

각 예제는 독립적으로 실행합니다. 추가 예제는 examples 하위 폴더에 분리했습니다. 소스 파일을 수정한 뒤 다시 실행하며, 컴파일 언어는 다시 빌드하세요.

### 예제 1

이 문서와 같은 폴더에서 실행합니다.

[main.py](main.py)

```sh
python main.py
```

Python 3.10 이상을 사용합니다. 플랫폼에 따라 python 대신 python3 명령을 사용하세요.
