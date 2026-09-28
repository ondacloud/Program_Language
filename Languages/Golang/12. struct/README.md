# 구조체 — 값 묶기

## 핵심 개념

struct는 이름 있는 필드를 묶어 사용자 정의 타입을 만듭니다.

## 실행 예제

```go
package main

import (
    "fmt"
)

type User struct {
    Name string
    Age int
}

func main() {
    first := User{Name: "Alice", Age: 20}
    second := first
    second.Age = 30
    fmt.Println(first.Age, second.Age)
}
```

## 실행 결과

```text
20 30
```

## 동작 원리와 주의사항

대문자로 시작하는 필드·타입 이름은 다른 패키지에 공개됩니다. 필드명을 지정한 리터럴은 순서 변경에 덜 취약합니다. struct는 값 복사되지만 slice나 map 필드 내부 데이터까지 깊게 복사하지는 않습니다. JSON 태그는 직렬화 시 이름을 제어합니다.

## 직접 확인하기

[]string 필드를 추가하고 복사본의 원소 수정이 원본에 보이는지 확인하세요.

---

[언어 목차](../README.md) · [이전](../11.%20pointer/README.md) · [다음](../13.%20method%20%26%20interface/README.md)

## 동봉 실행 파일과 실행 방법

각 예제는 독립적으로 실행합니다. 추가 예제는 examples 하위 폴더에 분리했습니다. 소스 파일을 수정한 뒤 다시 실행하며, 컴파일 언어는 다시 빌드하세요.

### 예제 1

이 문서와 같은 폴더에서 실행합니다.

[main.go](main.go)

```sh
go run main.go
```

Go 1.22 이상을 사용합니다. 테스트 장은 main 대신 테스트 함수로 실행합니다.
