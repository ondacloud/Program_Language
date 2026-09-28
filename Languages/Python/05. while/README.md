# while — 조건 반복

## 핵심 개념

조건이 참인 동안 반복하며 시작부터 거짓이면 실행하지 않습니다.

## 실행 예제

```python
count = 1
while count <= 3:
    print(count)
    count += 1
```

## 실행 결과

```text
1
2
3
```

## 동작 원리와 주의사항

조건을 바꾸는 갱신이나 종료 경로가 필요합니다. `while True`는 break나 return 등으로 끝냅니다. `while`의 else는 break 없이 조건이 거짓이 되어 끝났을 때 실행합니다.

## 직접 확인하기

count를 4로 시작하면 본문이 한 번도 실행되지 않는지 확인하세요.

---

[언어 목차](../README.md) · [이전](../04.%20for/README.md) · [다음](../06.%20break/README.md)

## 동봉 실행 파일과 실행 방법

각 예제는 독립적으로 실행합니다. 추가 예제는 examples 하위 폴더에 분리했습니다. 소스 파일을 수정한 뒤 다시 실행하며, 컴파일 언어는 다시 빌드하세요.

### 예제 1

이 문서와 같은 폴더에서 실행합니다.

[main.py](main.py)

```sh
python main.py
```

Python 3.10 이상을 사용합니다. 플랫폼에 따라 python 대신 python3 명령을 사용하세요.
