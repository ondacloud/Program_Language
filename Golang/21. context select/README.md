# context와 select — 취소 전달

## 핵심 개념

context는 작업의 취소·기한을 하위 호출로 전달하고 select는 여러 채널 연산 중 진행 가능한 하나를 선택합니다.

## 실행 예제

```go
package main

import (
    "fmt"
    "context"
)

func main() {
    ctx, cancel := context.WithCancel(context.Background())
    cancel()
    select {
    case <-ctx.Done():
        fmt.Println(ctx.Err())
    default:
        fmt.Println("working")
    }
}
```

## 실행 결과

```text
context canceled
```

## 동작 원리와 주의사항

실제 작업은 ctx.Done을 관찰하거나 context를 받는 API를 호출해야 취소에 반응합니다. 취소만으로 고루틴이 강제 종료되지 않습니다. WithTimeout/WithCancel의 cancel을 적절히 호출해 자원을 정리합니다. default가 있는 반복 select는 바쁜 대기가 될 수 있습니다. 여러 case가 준비되면 특정 우선순위를 보장하지 않습니다.

## 직접 확인하기

cancel 호출을 select 뒤로 옮겨 working 분기가 선택되는지 확인하세요.

---

[언어 목차](../README.md) · [이전](../20.%20defer%20panic%20recover/README.md) · [다음](../22.%20generics/README.md)

## 동봉 실행 파일과 실행 방법

각 예제는 독립적으로 실행합니다. 추가 예제는 examples 하위 폴더에 분리했습니다. 소스 파일을 수정한 뒤 다시 실행하며, 컴파일 언어는 다시 빌드하세요.

### 예제 1

이 문서와 같은 폴더에서 실행합니다.

[main.go](main.go)

```sh
go run main.go
```

Go 1.22 이상을 사용합니다. 테스트 장은 main 대신 테스트 함수로 실행합니다.
