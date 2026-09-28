# 고루틴 — 완료 대기와 공유 상태

## 핵심 개념

go 문은 함수를 새 고루틴에서 실행합니다. main이 끝나면 다른 고루틴 완료를 기다리지 않고 프로그램이 종료됩니다.

## 실행 예제

```go
package main

import (
    "fmt"
    "sync"
)

func main() {
    var wg sync.WaitGroup
    for i := 1; i <= 3; i++ {
        wg.Add(1)
        go func(value int) {
            defer wg.Done()
            fmt.Println(value)
        }(i)
    }
    wg.Wait()
    fmt.Println("done")
}
```

## 실행 결과

```text
1, 2, 3이 각각 한 번 출력 (순서는 달라질 수 있음)
마지막 줄: done
```

## 동작 원리와 주의사항

time.Sleep은 완료 보장이 아닙니다. WaitGroup.Add는 고루틴 시작 전에 호출하고 Done과 짝을 맞춥니다. WaitGroup을 사용하기 시작한 뒤 복사하지 않습니다. 동시에 공유 값을 수정하려면 Mutex, atomic 또는 channel 등으로 동기화합니다. `go test -race ./...`는 실행된 경로의 데이터 경쟁 탐지에 도움을 줍니다.

## 직접 확인하기

작업 수를 10개로 바꾸어도 done이 항상 마지막에 나오는지 확인하세요.

---

[언어 목차](../README.md) · [이전](../16.%20open%20file/README.md) · [다음](../18.%20channel/README.md)

## 동봉 실행 파일과 실행 방법

각 예제는 독립적으로 실행합니다. 추가 예제는 examples 하위 폴더에 분리했습니다. 소스 파일을 수정한 뒤 다시 실행하며, 컴파일 언어는 다시 빌드하세요.

### 예제 1

이 문서와 같은 폴더에서 실행합니다.

[main.go](main.go)

```sh
go run main.go
```

Go 1.22 이상을 사용합니다. 테스트 장은 main 대신 테스트 함수로 실행합니다.
