# 출력 — fmt

## 핵심 개념

fmt 패키지는 일반 출력과 서식 출력을 제공합니다. Println은 값 사이 공백과 마지막 줄바꿈을 넣습니다.

## 실행 예제

```go
package main

import (
    "fmt"
)

func main() {
    name := "Go"
    fmt.Print("Hello ")
    fmt.Println(name)
    fmt.Printf("value=%d type=%T price=%.2f\n", 3, 3, 2.5)
}
```

## 실행 결과

```text
Hello Go
value=3 type=int price=2.50
```

## 동작 원리와 주의사항

Printf는 자동 줄바꿈이 없으므로 `
`을 넣습니다. `%v`는 기본 형식, `%T`는 타입, `%d`는 정수, `%s`는 문자열, `%t`는 bool, `%p`는 포인터입니다. 형식과 타입이 맞는지 go vet로 점검하세요.

## 직접 확인하기

같은 값을 %v와 %T로 출력하여 값과 타입의 차이를 확인하세요.

---

[언어 목차](../README.md) · [이전](../00.%20operator/README.md) · [다음](../02.%20if/README.md)

## 동봉 실행 파일과 실행 방법

각 예제는 독립적으로 실행합니다. 추가 예제는 examples 하위 폴더에 분리했습니다. 소스 파일을 수정한 뒤 다시 실행하며, 컴파일 언어는 다시 빌드하세요.

### 예제 1

이 문서와 같은 폴더에서 실행합니다.

[main.go](main.go)

```sh
go run main.go
```

Go 1.22 이상을 사용합니다. 테스트 장은 main 대신 테스트 함수로 실행합니다.
