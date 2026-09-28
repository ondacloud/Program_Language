# new

## 핵심 개념

타입의 zero value를 위한 공간을 만들고 *T를 반환합니다.

## 실행 예제

```go
package main

import (
    "fmt"
)

func main() {
    value := new(int)
    fmt.Println(*value)
    *value = 10
    fmt.Println(*value)
}
```

## 실행 결과

```text
0
10
```

## 동작 원리와 주의사항

new(map[string]int)는 초기화된 map이 아니라 nil map을 가리키는 포인터입니다. map 쓰기에는 make나 리터럴이 필요합니다. 이 문서는 타입 인수 형태의 new(T)를 다룹니다.

## 직접 확인하기

입력을 빈 값·중복 값·경계값으로 바꾸어 결과와 원본 변경 여부를 확인하세요.

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
