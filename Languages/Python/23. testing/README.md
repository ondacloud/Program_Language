# 표준 라이브러리로 테스트하기

## 핵심 개념

테스트는 정상 입력뿐 아니라 경계값과 실패 동작을 확인합니다. unittest는 별도 설치 없이 사용할 수 있습니다.

## 실행 예제

```python
import unittest

def average(values):
    if not values:
        raise ValueError("empty values")
    return sum(values) / len(values)

class AverageTest(unittest.TestCase):
    def test_average(self):
        self.assertEqual(average([2, 4]), 3)

    def test_empty(self):
        with self.assertRaises(ValueError):
            average([])

if __name__ == "__main__":
    unittest.main()
```

## 실행 결과

```text
테스트 2개 성공: OK (소요 시간과 출력 형식은 환경에 따라 다름)
```

## 동작 원리와 주의사항

test_average.py로 저장하고 `python -m unittest -v`를 실행합니다. 테스트끼리 공유 상태나 실행 순서에 의존하지 않게 만드세요. 부동소수점 근삿값은 assertAlmostEqual 등 허용 오차를 고려합니다.

## 직접 확인하기

원소가 하나인 경우와 음수가 포함된 경우를 추가하세요.

---

[언어 목차](../README.md) · [이전](../22.%20decorator%20context%20manager/README.md) · [다음](../24.%20json%20pathlib/README.md)

## 동봉 실행 파일과 실행 방법

각 예제는 독립적으로 실행합니다. 추가 예제는 examples 하위 폴더에 분리했습니다. 소스 파일을 수정한 뒤 다시 실행하며, 컴파일 언어는 다시 빌드하세요.

### 예제 1

이 문서와 같은 폴더에서 실행합니다.

[main.py](main.py)

```sh
python main.py
```

Python 3.10 이상을 사용합니다. 플랫폼에 따라 python 대신 python3 명령을 사용하세요.
