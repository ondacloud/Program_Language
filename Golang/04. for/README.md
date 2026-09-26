# for와 range

## 핵심 개념

Go는 for 하나로 횟수 반복, 조건 반복, 무한 반복, 컬렉션 순회를 표현합니다.

## 실행 예제

```go
package main

import (
    "fmt"
)

func main() {
    numbers := []int{10, 20}
    for index, value := range numbers {
        fmt.Println(index, value)
    }
    count := 2
    for count > 0 {
        fmt.Println(count)
        count--
    }
}
```

## 실행 결과

```text
0 10
1 20
2
1
```

## 동작 원리와 주의사항

`for i := 0; i < n; i++`는 전통적인 형태이고 `for {}`는 무한 반복입니다. range의 value는 원소 값의 복사본입니다. slice의 값을 바꾸려면 `numbers[index]`에 대입합니다. Go 1.22 언어 버전부터 :=로 선언한 루프 변수는 반복마다 새 변수가 되지만 `=`로 기존 변수를 사용하는 경우와 구별하세요.

## 직접 확인하기

range를 사용해 numbers의 원소를 각각 2배로 변경하세요.

---

[언어 목차](../README.md) · [이전](../03.%20switch/README.md) · [다음](../05.%20break/README.md)

## 동봉 실행 파일과 실행 방법

각 예제는 독립적으로 실행합니다. 추가 예제는 examples 하위 폴더에 분리했습니다. 소스 파일을 수정한 뒤 다시 실행하며, 컴파일 언어는 다시 빌드하세요.

### 예제 1

이 문서와 같은 폴더에서 실행합니다.

[main.go](main.go)

```sh
go run main.go
```

Go 1.22 이상을 사용합니다. 테스트 장은 main 대신 테스트 함수로 실행합니다.
