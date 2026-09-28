# defer, panic, recover

## 핵심 개념

defer는 함수가 반환할 때 호출할 작업을 등록합니다. panic은 정상 흐름을 중단하고 스택을 풀어 올라갑니다.

## 실행 예제

```go
package main

import (
    "fmt"
)

func main() {
    defer fmt.Println("first")
    defer fmt.Println("second")
    value := 1
    defer fmt.Println("captured", value)
    value = 2
    fmt.Println("body", value)
}
```

## 실행 결과

```text
body 2
captured 1
second
first
```

## 동작 원리와 주의사항

defer 인수는 등록 시 평가되고 호출은 역순입니다. 반복문 안의 defer는 반복 끝이 아니라 함수 끝에 실행되므로 많은 자원을 오래 잡을 수 있습니다. recover는 패닉이 발생한 같은 고루틴의 deferred 함수에서 직접 호출해야 합니다. 일반 오류 처리에 panic/recover를 남용하지 마세요.

## 직접 확인하기

defer로 익명 함수를 등록해 value를 그 함수 안에서 읽으면 출력이 2가 되는 이유를 설명하세요.

---

[언어 목차](../README.md) · [이전](../19.%20module%20package/README.md) · [다음](../21.%20context%20select/README.md)

## 동봉 실행 파일과 실행 방법

각 예제는 독립적으로 실행합니다. 추가 예제는 examples 하위 폴더에 분리했습니다. 소스 파일을 수정한 뒤 다시 실행하며, 컴파일 언어는 다시 빌드하세요.

### 예제 1

이 문서와 같은 폴더에서 실행합니다.

[main.go](main.go)

```sh
go run main.go
```

Go 1.22 이상을 사용합니다. 테스트 장은 main 대신 테스트 함수로 실행합니다.
