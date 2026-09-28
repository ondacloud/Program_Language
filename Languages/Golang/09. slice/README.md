# 슬라이스 — 길이, 용량, 기저 배열

## 핵심 개념

slice는 기저 배열을 참조하는 값으로 길이 len과 용량 cap을 가집니다.

## 실행 예제

```go
package main

import (
    "fmt"
)

func main() {
    base := []int{1, 2, 3}
    view := base[:2]
    view[0] = 9
    fmt.Println(base)
    independent := make([]int, len(view))
    copy(independent, view)
    independent[0] = 7
    fmt.Println(base, independent)
    fmt.Println(len(view), cap(view))
}
```

## 실행 결과

```text
[9 2 3]
[9 2 3] [7 2]
2 3
```

## 동작 원리와 주의사항

부분 슬라이스는 원소를 공유합니다. append는 용량이 충분하면 같은 배열을 사용하고 부족하면 새 배열을 할당합니다. 따라서 항상 `s = append(s, value)`로 결과를 사용하세요. `make([]int, 3, 10)`은 길이 3과 용량 10이며 인덱스 3에 바로 접근할 수는 없습니다. nil slice에도 append할 수 있습니다.

## 직접 확인하기

`base[:2:2]`로 용량을 제한한 slice에 append하면 원래 배열과의 관계가 어떻게 달라지는지 확인하세요.

---

[언어 목차](../README.md) · [이전](../08.%20array/README.md) · [다음](../10.%20map/README.md)

## 동봉 실행 파일과 실행 방법

각 예제는 독립적으로 실행합니다. 추가 예제는 examples 하위 폴더에 분리했습니다. 소스 파일을 수정한 뒤 다시 실행하며, 컴파일 언어는 다시 빌드하세요.

### 예제 1

이 문서와 같은 폴더에서 실행합니다.

[main.go](main.go)

```sh
go run main.go
```

Go 1.22 이상을 사용합니다. 테스트 장은 main 대신 테스트 함수로 실행합니다.
