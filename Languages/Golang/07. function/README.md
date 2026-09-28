# 함수 — 값 전달, 다중 반환, 가변 인수

## 핵심 개념

함수는 인수의 값을 복사해 받습니다. 여러 반환값과 함수 값도 지원합니다.

## 실행 예제

```go
package main

import (
    "fmt"
)

func summarize(values ...int) (int, int) {
    total := 0
    for _, value := range values {
        total += value
    }
    return total, len(values)
}

func main() {
    sum, count := summarize(1, 2, 3)
    fmt.Println(sum, count)
    values := []int{4, 5}
    fmt.Println(summarize(values...))
}
```

## 실행 결과

```text
6 3
9 2
```

## 동작 원리와 주의사항

가변 인수는 함수 안에서 slice입니다. slice를 인수 목록으로 펼칠 때 `...`를 붙입니다. slice 값이 복사되어도 기저 배열은 공유할 수 있습니다. `(값, error)` 반환에서는 error를 먼저 확인합니다. 이름 있는 반환값을 지나치게 사용하면 반환 지점의 의미가 불명확해질 수 있습니다.

## 직접 확인하기

인수가 없을 때 반환되는 합과 개수를 예상하세요. 답: 0, 0.

---

[언어 목차](../README.md) · [이전](../06.%20continue/README.md) · [다음](../08.%20array/README.md)

## 동봉 실행 파일과 실행 방법

각 예제는 독립적으로 실행합니다. 추가 예제는 examples 하위 폴더에 분리했습니다. 소스 파일을 수정한 뒤 다시 실행하며, 컴파일 언어는 다시 빌드하세요.

### 예제 1

이 문서와 같은 폴더에서 실행합니다.

[main.go](main.go)

```sh
go run main.go
```

Go 1.22 이상을 사용합니다. 테스트 장은 main 대신 테스트 함수로 실행합니다.
