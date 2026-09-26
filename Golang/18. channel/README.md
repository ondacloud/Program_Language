# 채널 — 전달, close, range

## 핵심 개념

channel은 타입이 정해진 통신 통로입니다. 버퍼 없는 채널은 송신과 수신이 만날 때 값이 전달됩니다.

## 실행 예제

```go
package main

import (
    "fmt"
)

func main() {
    values := make(chan int)
    go func() {
        defer close(values)
        for i := 1; i <= 3; i++ {
            values <- i
        }
    }()
    total := 0
    for value := range values {
        total += value
    }
    fmt.Println(total)
}
```

## 실행 결과

```text
6
```

## 동작 원리와 주의사항

생산을 끝낸 송신 측에서 close하는 구조를 사용합니다. 닫힌 채널에 송신하거나 다시 close하면 panic입니다. 수신은 남은 버퍼를 먼저 비운 뒤 zero value와 false를 반환합니다. `value, ok := <-ch`로 구분합니다. nil 채널의 송수신은 영원히 대기하며 for range는 close가 없으면 종료되지 않을 수 있습니다.

## 직접 확인하기

make(chan int, 3)으로 버퍼를 추가해도 합계와 종료 조건이 유지되는지 확인하세요.

---

[언어 목차](../README.md) · [이전](../17.%20goroutine/README.md) · [다음](../19.%20module%20package/README.md)

## 동봉 실행 파일과 실행 방법

각 예제는 독립적으로 실행합니다. 추가 예제는 examples 하위 폴더에 분리했습니다. 소스 파일을 수정한 뒤 다시 실행하며, 컴파일 언어는 다시 빌드하세요.

### 예제 1

이 문서와 같은 폴더에서 실행합니다.

[main.go](main.go)

```sh
go run main.go
```

Go 1.22 이상을 사용합니다. 테스트 장은 main 대신 테스트 함수로 실행합니다.
