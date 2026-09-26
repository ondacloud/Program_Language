# for — 순회

## 핵심 개념

반복 가능한 객체에서 원소를 하나씩 꺼냅니다.

## 실행 예제

```python
names = ["Alice", "Bob"]
for index, name in enumerate(names, start=1):
    print(index, name)
print(list(range(1, 4)))
```

## 실행 결과

```text
1 Alice
2 Bob
[1, 2, 3]
```

## 동작 원리와 주의사항

`range`의 stop은 포함하지 않습니다. 인덱스와 값이 모두 필요하면 `enumerate`, 두 시퀀스를 함께 순회하려면 `zip`을 씁니다. 순회 중 같은 리스트에서 요소를 삭제하면 건너뛰는 원소가 생길 수 있습니다.

## 직접 확인하기

range(5, 0, -2)의 결과를 확인하세요. 답: 5, 3, 1.

---

[언어 목차](../README.md) · [이전](../03.%20match%20%26%20case/README.md) · [다음](../05.%20while/README.md)

## 동봉 실행 파일과 실행 방법

각 예제는 독립적으로 실행합니다. 추가 예제는 examples 하위 폴더에 분리했습니다. 소스 파일을 수정한 뒤 다시 실행하며, 컴파일 언어는 다시 빌드하세요.

### 예제 1

이 문서와 같은 폴더에서 실행합니다.

[main.py](main.py)

```sh
python main.py
```

Python 3.10 이상을 사용합니다. 플랫폼에 따라 python 대신 python3 명령을 사용하세요.
