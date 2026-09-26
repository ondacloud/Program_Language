# len

## 핵심 개념

문자열·배열·slice·map·channel 등의 길이를 반환합니다.

## 실행 예제

```go
package main

import (
    "fmt"
)

func main() {
    fmt.Println(len("가"))
    fmt.Println(len([]rune("가")))
}
```

## 실행 결과

```text
3
1
```

## 동작 원리와 주의사항

string은 바이트 수입니다. channel은 현재 버퍼에 대기 중인 원소 수이며 동기화 판단의 근거로 삼지 마세요. nil slice/map/channel 길이는 0입니다.

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
