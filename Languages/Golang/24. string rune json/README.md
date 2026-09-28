# 문자열, rune, JSON

## 핵심 개념

Go 문자열은 불변 바이트열입니다. Unicode 코드 포인트 순회는 range를 사용하고 JSON은 encoding/json으로 처리합니다.

## 실행 예제

```go
package main

import (
    "fmt"
    "encoding/json"
)

type User struct {
    Name string `json:"name"`
    Age int `json:"age"`
}

func main() {
    text := "가A"
    fmt.Println(len(text), len([]rune(text)))
    for index, value := range text {
        fmt.Printf("%d %c\n", index, value)
    }
    data, err := json.Marshal(User{Name: "Alice", Age: 20})
    if err != nil { panic(err) }
    fmt.Println(string(data))
}
```

## 실행 결과

```text
4 2
0 가
3 A
{"name":"Alice","age":20}
```

## 동작 원리와 주의사항

range의 문자열 인덱스는 바이트 위치입니다. rune 개수도 화면의 글자 묶음 개수와 항상 같지는 않습니다. JSON은 공개 필드만 처리하며 Unmarshal에는 &target을 전달합니다. JSON 문법이 맞아도 필수 값·범위 검증은 별도로 해야 합니다.

## 직접 확인하기

json.Unmarshal로 위 JSON을 User에 복원하고 오류를 확인하세요.

---

[언어 목차](../README.md) · [이전](../23.%20testing/README.md)

## 동봉 실행 파일과 실행 방법

각 예제는 독립적으로 실행합니다. 추가 예제는 examples 하위 폴더에 분리했습니다. 소스 파일을 수정한 뒤 다시 실행하며, 컴파일 언어는 다시 빌드하세요.

### 예제 1

이 문서와 같은 폴더에서 실행합니다.

[main.go](main.go)

```sh
go run main.go
```

Go 1.22 이상을 사용합니다. 테스트 장은 main 대신 테스트 함수로 실행합니다.
