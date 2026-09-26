# else if — 여러 조건

## 핵심 개념

조건식은 bool이어야 하며 괄호는 필수가 아닙니다. 중괄호는 필수입니다.

## 실행 예제

```go
package main

import (
    "fmt"
)

func main() {
    value := 0
    if value < 0 {
        fmt.Println("negative")
    } else if value == 0 {
        fmt.Println("zero")
    } else {
        fmt.Println("positive")
    }
}
```

## 실행 결과

```text
zero
```

## 동작 원리와 주의사항

`else`는 앞의 닫는 중괄호와 같은 줄에 둡니다. Go의 자동 세미콜론 삽입 때문입니다. `if value := calculate(); value > 0`처럼 초기화문을 사용할 수 있으며 그 변수는 해당 if/else 범위에서만 보입니다.

## 직접 확인하기

경계값 바로 아래·같은 값·바로 위 값을 넣고 어느 분기가 실행되는지 확인하세요.

---

[언어 목차](../../README.md) · [상위 주제](../README.md)

## 동봉 실행 파일과 실행 방법

각 예제는 독립적으로 실행합니다. 추가 예제는 examples 하위 폴더에 분리했습니다. 소스 파일을 수정한 뒤 다시 실행하며, 컴파일 언어는 다시 빌드하세요.

### 예제 1

이 문서와 같은 폴더에서 실행합니다.

[main.go](main.go)

```sh
go run main.go
```

Go 1.22 이상을 사용합니다. 테스트 장은 main 대신 테스트 함수로 실행합니다.
