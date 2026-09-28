# 배열 — 길이도 타입의 일부

## 핵심 개념

배열은 고정 길이를 가지며 대입·인수 전달 때 전체 값이 복사됩니다.

## 실행 예제

```go
package main

import (
    "fmt"
)

func main() {
    original := [3]int{1, 2, 3}
    copied := original
    copied[0] = 9
    fmt.Println(original)
    fmt.Println(copied)
}
```

## 실행 결과

```text
[1 2 3]
[9 2 3]
```

## 동작 원리와 주의사항

[3]int와 [4]int는 다른 타입입니다. `[...]int{1,2}`로 길이를 추론할 수 있습니다. 인덱스는 0부터 len-1까지입니다. 동적 목록은 보통 slice를 사용합니다.

## 직접 확인하기

배열을 slice로 바꾸고 같은 실험을 하세요. slice 대입은 원소 배열을 복사하지 않습니다.

---

[언어 목차](../README.md) · [이전](../07.%20function/README.md) · [다음](../09.%20slice/README.md)

## 동봉 실행 파일과 실행 방법

각 예제는 독립적으로 실행합니다. 추가 예제는 examples 하위 폴더에 분리했습니다. 소스 파일을 수정한 뒤 다시 실행하며, 컴파일 언어는 다시 빌드하세요.

### 예제 1

이 문서와 같은 폴더에서 실행합니다.

[main.go](main.go)

```sh
go run main.go
```

Go 1.22 이상을 사용합니다. 테스트 장은 main 대신 테스트 함수로 실행합니다.
