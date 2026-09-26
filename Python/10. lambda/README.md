# lambda — 짧은 함수 표현식

## 핵심 개념

lambda는 한 개의 표현식을 결과로 반환하는 익명 함수를 만듭니다.

## 실행 예제

```python
users = [("Alice", 30), ("Bob", 20)]
print(sorted(users, key=lambda user: user[1]))
```

## 실행 결과

```text
[('Bob', 20), ('Alice', 30)]
```

## 동작 원리와 주의사항

정렬 키처럼 짧은 동작을 전달할 때 유용합니다. 여러 문장, 자세한 설명, 복잡한 분기가 필요하면 def를 씁니다. 클로저는 바깥 변수의 값을 정의 시 자동 복사하지 않으므로 반복문 변수 캡처에 주의하세요.

## 직접 확인하기

이름의 역순으로 정렬하세요. 답: key=lambda user: user[0], reverse=True.

---

[언어 목차](../README.md) · [이전](../09.%20list/README.md) · [다음](../11.%20nonlocal/README.md)

## 동봉 실행 파일과 실행 방법

각 예제는 독립적으로 실행합니다. 추가 예제는 examples 하위 폴더에 분리했습니다. 소스 파일을 수정한 뒤 다시 실행하며, 컴파일 언어는 다시 빌드하세요.

### 예제 1

이 문서와 같은 폴더에서 실행합니다.

[main.py](main.py)

```sh
python main.py
```

Python 3.10 이상을 사용합니다. 플랫폼에 따라 python 대신 python3 명령을 사용하세요.
