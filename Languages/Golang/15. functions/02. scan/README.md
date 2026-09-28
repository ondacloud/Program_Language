# fmt.Scan

## 핵심 개념

공백으로 구분된 입력을 읽습니다.

## 실행 예제

```go
package main

import (
    "fmt"
)

func main() {
    var name string
    var age int
    if n, err := fmt.Scan(&name, &age); err != nil || n != 2 {
        fmt.Println("invalid input")
        return
    }
    fmt.Println(name, age)
}
```

## 실행 결과

```text
입력: Alice 20 → 출력: Alice 20
```

## 동작 원리와 주의사항

대상 변수의 주소를 넘깁니다. 반환 개수와 오류를 검사합니다. 이름에 공백을 포함하는 한 줄 입력은 bufio.Scanner 등으로 처리합니다.

## 직접 확인하기

입력을 빈 값·중복 값·경계값으로 바꾸어 결과와 원본 변경 여부를 확인하세요.

---

[언어 목차](../../README.md) · [상위 주제](../README.md)

## 동봉 실행 파일과 실행 방법

각 예제는 독립적으로 실행합니다. 추가 예제는 examples 하위 폴더에 분리했습니다. 소스 파일을 수정한 뒤 다시 실행하며, 컴파일 언어는 다시 빌드하세요.

### 예제 1

이 문서와 같은 폴더에서 실행합니다.

[main.go](main.go) · [input.txt](input.txt)

```sh
go run main.go
```

Go 1.22 이상을 사용합니다. 테스트 장은 main 대신 테스트 함수로 실행합니다.

입력을 요청하면 아래 내용을 순서대로 입력하세요. 같은 내용의 input.txt도 제공합니다.

```text
Alice 20
```
