# switch — 값과 조건 분기

## 핵심 개념

Go의 switch는 첫 일치 case를 실행한 뒤 기본적으로 빠져나옵니다.

## 실행 예제

```go
package main

import (
    "fmt"
)

func main() {
    score := 85
    switch {
    case score >= 90:
        fmt.Println("A")
    case score >= 80:
        fmt.Println("B")
    default:
        fmt.Println("C")
    }
}
```

## 실행 결과

```text
B
```

## 동작 원리와 주의사항

표현식을 생략하면 switch true와 같습니다. `case 1, 2:`처럼 여러 값을 묶을 수 있습니다. C처럼 매 case에 break를 넣을 필요가 없습니다. 명시적인 fallthrough는 다음 case의 조건을 검사하지 않고 이동하므로 특별한 이유가 있을 때만 사용합니다.

## 직접 확인하기

정수 메뉴 1·2는 open, 그 외는 unknown으로 출력하는 값 기반 switch를 작성하세요.

---

[언어 목차](../README.md) · [이전](../02.%20if/README.md) · [다음](../04.%20for/README.md)

## 동봉 실행 파일과 실행 방법

각 예제는 독립적으로 실행합니다. 추가 예제는 examples 하위 폴더에 분리했습니다. 소스 파일을 수정한 뒤 다시 실행하며, 컴파일 언어는 다시 빌드하세요.

### 예제 1

이 문서와 같은 폴더에서 실행합니다.

[main.go](main.go)

```sh
go run main.go
```

Go 1.22 이상을 사용합니다. 테스트 장은 main 대신 테스트 함수로 실행합니다.
