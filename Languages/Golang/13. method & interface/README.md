# 메서드와 인터페이스

## 핵심 개념

메서드는 receiver가 있는 함수입니다. 타입이 필요한 메서드를 제공하면 명시적 implements 없이 인터페이스를 충족합니다.

## 실행 예제

```go
package main

import (
    "fmt"
)

type Adder interface {
    Add(int)
}

type Counter struct { Value int }

func (c *Counter) Add(value int) {
    c.Value += value
}

func main() {
    counter := Counter{}
    var adder Adder = &counter
    adder.Add(3)
    fmt.Println(counter.Value)
}
```

## 실행 결과

```text
3
```

## 동작 원리와 주의사항

값 receiver는 복사본을 받고 포인터 receiver는 원본 변경에 적합합니다. 위에서 Add는 *Counter의 메서드이므로 Counter 값은 Adder를 충족하지 않습니다. 인터페이스는 동적 타입과 값을 함께 담아 typed nil 포인터를 넣으면 인터페이스 자체가 nil이 아닐 수 있습니다. 가능한 작은 인터페이스를 소비하는 쪽에 정의하세요.

## 직접 확인하기

`var adder Adder = counter`로 바꾸면 컴파일되지 않는 이유를 설명하세요.

---

[언어 목차](../README.md) · [이전](../12.%20struct/README.md) · [다음](../14.%20error/README.md)

## 동봉 실행 파일과 실행 방법

각 예제는 독립적으로 실행합니다. 추가 예제는 examples 하위 폴더에 분리했습니다. 소스 파일을 수정한 뒤 다시 실행하며, 컴파일 언어는 다시 빌드하세요.

### 예제 1

이 문서와 같은 폴더에서 실행합니다.

[main.go](main.go)

```sh
go run main.go
```

Go 1.22 이상을 사용합니다. 테스트 장은 main 대신 테스트 함수로 실행합니다.
