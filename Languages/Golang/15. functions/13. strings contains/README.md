# strings.Contains

## 핵심 개념

부분 문자열 포함 여부를 bool로 반환합니다.

## 실행 예제

```go
package main

import (
    "fmt"
    "strings"
)

func main() {
    fmt.Println(strings.Contains("Hello Go", "Go"))
}
```

## 실행 결과

```text
true
```

## 동작 원리와 주의사항

대소문자를 구분합니다. 위치가 필요하면 strings.Index를 사용합니다. 빈 부분 문자열은 포함된 것으로 판단합니다.

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
