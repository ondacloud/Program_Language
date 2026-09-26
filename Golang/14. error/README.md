# 오류 — error 값과 wrapping

## 핵심 개념

실패를 error 값으로 반환하고 호출자가 처리합니다. 성공하면 보통 nil error입니다.

## 실행 예제

```go
package main

import (
    "fmt"
    "errors"
)

var ErrZero = errors.New("zero divisor")

func divide(a, b float64) (float64, error) {
    if b == 0 {
        return 0, ErrZero
    }
    return a / b, nil
}

func main() {
    _, err := divide(10, 0)
    if err != nil {
        wrapped := fmt.Errorf("calculate: %w", err)
        fmt.Println(wrapped)
        fmt.Println(errors.Is(wrapped, ErrZero))
    }
}
```

## 실행 결과

```text
calculate: zero divisor
true
```

## 동작 원리와 주의사항

%w로 감싸면 errors.Is/As로 내부 원인을 검사할 수 있습니다. 오류 문자열 비교는 메시지 변경에 취약합니다. errors.As는 특정 오류 타입을 찾아 상세 정보를 읽을 때 사용합니다. 일반적인 잘못된 입력은 panic보다 error 반환으로 표현합니다.

## 직접 확인하기

분모를 2로 바꾸고 성공 결과를 출력하도록 분기를 추가하세요.

---

[언어 목차](../README.md) · [이전](../13.%20method%20%26%20interface/README.md) · [다음](../15.%20functions/README.md)

## 동봉 실행 파일과 실행 방법

각 예제는 독립적으로 실행합니다. 추가 예제는 examples 하위 폴더에 분리했습니다. 소스 파일을 수정한 뒤 다시 실행하며, 컴파일 언어는 다시 빌드하세요.

### 예제 1

이 문서와 같은 폴더에서 실행합니다.

[main.go](main.go)

```sh
go run main.go
```

Go 1.22 이상을 사용합니다. 테스트 장은 main 대신 테스트 함수로 실행합니다.
