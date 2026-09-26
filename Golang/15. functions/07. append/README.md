# append

## 핵심 개념

slice 끝에 원소를 추가한 slice를 반환합니다.

## 실행 예제

```go
package main

import (
    "fmt"
)

func main() {
    values := []int{1}
    values = append(values, 2, 3)
    values = append(values, []int{4, 5}...)
    fmt.Println(values)
}
```

## 실행 결과

```text
[1 2 3 4 5]
```

## 동작 원리와 주의사항

반환값을 저장하세요. 용량에 따라 기저 배열 재사용 여부가 달라집니다. 다른 slice와 공유 여부를 가정하지 마세요.

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
