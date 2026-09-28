# 파일 읽기와 쓰기

## 핵심 개념

os.ReadFile/WriteFile은 작은 파일을 간단히 처리하고, 큰 파일은 스트림 방식으로 읽습니다.

## 실행 예제

```go
package main

import (
    "fmt"
    "os"
    "path/filepath"
)

func main() {
    directory, err := os.MkdirTemp("", "go-study-")
    if err != nil { panic(err) }
    defer os.RemoveAll(directory)
    path := filepath.Join(directory, "example.txt")
    if err := os.WriteFile(path, []byte("Hello Go"), 0600); err != nil {
        panic(err)
    }
    data, err := os.ReadFile(path)
    if err != nil { panic(err) }
    fmt.Println(string(data))
}
```

## 실행 결과

```text
Hello Go
```

## 동작 원리와 주의사항

예제는 임시 폴더를 생성하고 정리합니다. panic은 예제의 진행 불가능한 오류를 드러내기 위한 것이며 라이브러리에서는 보통 error를 반환합니다. WriteFile은 기존 내용을 지웁니다. os.Open 후 오류 확인을 먼저 하고 defer file.Close()를 등록합니다. 쓰기 파일은 Close 오류도 확인해야 합니다. bufio.Scanner는 토큰 크기 제한과 Err 확인이 필요합니다.

## 직접 확인하기

ReadFile을 호출하기 전에 파일을 삭제하여 오류 경로를 확인하세요.

---

[언어 목차](../README.md) · [이전](../15.%20functions/README.md) · [다음](../17.%20goroutine/README.md)

## 동봉 실행 파일과 실행 방법

각 예제는 독립적으로 실행합니다. 추가 예제는 examples 하위 폴더에 분리했습니다. 소스 파일을 수정한 뒤 다시 실행하며, 컴파일 언어는 다시 빌드하세요.

### 예제 1

이 문서와 같은 폴더에서 실행합니다.

[main.go](main.go)

```sh
go run main.go
```

Go 1.22 이상을 사용합니다. 테스트 장은 main 대신 테스트 함수로 실행합니다.
