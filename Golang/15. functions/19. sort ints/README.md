# sort.Ints

## 핵심 개념

[]int를 오름차순으로 제자리 정렬합니다.

## 실행 예제

```go
package main

import (
    "fmt"
    "sort"
)

func main() {
    values := []int{3, 1, 2}
    sort.Ints(values)
    fmt.Println(values)
}
```

## 실행 결과

```text
[1 2 3]
```

## 동작 원리와 주의사항

반환값이 없고 원본을 변경합니다. 원본이 필요하면 먼저 copy합니다. Go 1.21 이상에서는 slices.Sort도 사용할 수 있습니다.

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
