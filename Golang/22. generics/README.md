# 제네릭 — 타입 매개변수

## 핵심 개념

Go 1.18 이상에서는 타입 매개변수로 타입 안전한 공통 알고리즘을 작성할 수 있습니다.

## 실행 예제

```go
package main

import (
    "fmt"
)

func Contains[T comparable](values []T, target T) bool {
    for _, value := range values {
        if value == target {
            return true
        }
    }
    return false
}

func main() {
    fmt.Println(Contains([]int{1, 2, 3}, 2))
    fmt.Println(Contains([]string{"a", "b"}, "x"))
}
```

## 실행 결과

```text
true
false
```

## 동작 원리와 주의사항

comparable은 ==와 !=가 가능한 타입을 요구합니다. any는 모든 타입을 허용하지만 그 자체로 산술이나 비교를 허용하지 않습니다. 인터페이스는 동작의 추상화에, 제네릭은 여러 타입에 같은 자료구조·알고리즘을 적용하는 데 유용합니다.

## 직접 확인하기

[][]int를 전달할 수 없는 이유를 설명하세요. []int는 비교 가능한 타입이 아닙니다.

---

[언어 목차](../README.md) · [이전](../21.%20context%20select/README.md) · [다음](../23.%20testing/README.md)

## 동봉 실행 파일과 실행 방법

각 예제는 독립적으로 실행합니다. 추가 예제는 examples 하위 폴더에 분리했습니다. 소스 파일을 수정한 뒤 다시 실행하며, 컴파일 언어는 다시 빌드하세요.

### 예제 1

이 문서와 같은 폴더에서 실행합니다.

[main.go](main.go)

```sh
go run main.go
```

Go 1.22 이상을 사용합니다. 테스트 장은 main 대신 테스트 함수로 실행합니다.
