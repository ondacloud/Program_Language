# map — 키 조회와 존재 여부

## 핵심 개념

map은 비교 가능한 키를 값에 연결합니다. 없는 키를 조회하면 값 타입의 zero value를 반환합니다.

## 실행 예제

```go
package main

import (
    "fmt"
)

func main() {
    scores := map[string]int{"Alice": 0}
    value, exists := scores["Alice"]
    fmt.Println(value, exists)
    value, exists = scores["Bob"]
    fmt.Println(value, exists)
    delete(scores, "Alice")
    fmt.Println(len(scores))
}
```

## 실행 결과

```text
0 true
0 false
0
```

## 동작 원리와 주의사항

값이 0인 경우와 키가 없는 경우는 comma-ok로 구분합니다. nil map은 읽기와 delete가 가능하지만 쓰면 panic입니다. make 또는 리터럴로 초기화하세요. 순회 순서는 보장되지 않습니다. 일반 map의 동시 읽기·쓰기는 동기화해야 합니다.

## 직접 확인하기

없는 키에 10을 넣은 뒤 값과 exists를 다시 확인하세요.

---

[언어 목차](../README.md) · [이전](../09.%20slice/README.md) · [다음](../11.%20pointer/README.md)

## 동봉 실행 파일과 실행 방법

각 예제는 독립적으로 실행합니다. 추가 예제는 examples 하위 폴더에 분리했습니다. 소스 파일을 수정한 뒤 다시 실행하며, 컴파일 언어는 다시 빌드하세요.

### 예제 1

이 문서와 같은 폴더에서 실행합니다.

[main.go](main.go)

```sh
go run main.go
```

Go 1.22 이상을 사용합니다. 테스트 장은 main 대신 테스트 함수로 실행합니다.
