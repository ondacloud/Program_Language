# break와 반복문의 else

## 핵심 개념

break는 가장 가까운 반복문을 종료합니다. 반복문의 else는 break 없이 순회를 끝냈을 때 실행합니다.

## 실행 예제

```python
for number in [1, 3, 4, 5]:
    if number % 2 == 0:
        print("found", number)
        break
else:
    print("not found")
```

## 실행 결과

```text
found 4
```

## 동작 원리와 주의사항

else는 if가 아니라 for와 같은 들여쓰기에 둡니다. 중첩 반복문에서 break는 가장 안쪽 반복만 종료합니다.

## 직접 확인하기

리스트에서 4를 빼세요. 결과: not found.

---

[언어 목차](../README.md) · [이전](../05.%20while/README.md) · [다음](../07.%20continue/README.md)

## 동봉 실행 파일과 실행 방법

각 예제는 독립적으로 실행합니다. 추가 예제는 examples 하위 폴더에 분리했습니다. 소스 파일을 수정한 뒤 다시 실행하며, 컴파일 언어는 다시 빌드하세요.

### 예제 1

이 문서와 같은 폴더에서 실행합니다.

[main.py](main.py)

```sh
python main.py
```

Python 3.10 이상을 사용합니다. 플랫폼에 따라 python 대신 python3 명령을 사용하세요.
