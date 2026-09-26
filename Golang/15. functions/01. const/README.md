# 상수와 iota

## 핵심 개념

const는 컴파일 시 결정되는 상수를 정의합니다.

## 실행 예제

```go
package main

import (
    "fmt"
)

func main() {
    const (
        Read = 1 << iota
        Write
        Execute
    )
    fmt.Println(Read, Write, Execute)
}
```

## 실행 결과

```text
1 2 4
```

## 동작 원리와 주의사항

상수는 숫자·bool·문자열 값 등에 사용합니다. slice나 map을 const로 선언하지 못합니다. iota는 const 선언 그룹에서 0부터 증가합니다.

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
