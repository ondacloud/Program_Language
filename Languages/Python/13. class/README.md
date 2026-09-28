# 클래스 — 인스턴스와 상태

## 핵심 개념

클래스는 속성과 메서드를 묶습니다. `self`는 호출 대상 인스턴스이며 `__init__`은 만들어진 인스턴스를 초기화합니다.

## 실행 예제

```python
class Cart:
    def __init__(self):
        self.items = []

    def add(self, item):
        self.items.append(item)

first = Cart()
second = Cart()
first.add("book")
print(first.items)
print(second.items)
```

## 실행 결과

```text
['book']
[]
```

## 동작 원리와 주의사항

리스트 같은 인스턴스별 상태는 `self.items`에 둡니다. 클래스 본문에 `items = []`를 두면 모든 인스턴스가 공유합니다. 상속은 `class Child(Parent)`로 표현하고 `super()`로 상위 동작을 호출합니다. `_name`은 내부 사용 관례이며 접근을 강제로 막지는 않습니다.

## 직접 확인하기

장바구니 원소 수를 반환하는 메서드를 추가하세요. len(self.items)를 사용합니다.

---

[언어 목차](../README.md) · [이전](../12.%20global/README.md) · [다음](../14.%20try/README.md)

## 동봉 실행 파일과 실행 방법

각 예제는 독립적으로 실행합니다. 추가 예제는 examples 하위 폴더에 분리했습니다. 소스 파일을 수정한 뒤 다시 실행하며, 컴파일 언어는 다시 빌드하세요.

### 예제 1

이 문서와 같은 폴더에서 실행합니다.

[main.py](main.py)

```sh
python main.py
```

Python 3.10 이상을 사용합니다. 플랫폼에 따라 python 대신 python3 명령을 사용하세요.
