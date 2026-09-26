# 테스트와 도구

## 파일 구성

모듈을 만든 연습 폴더에서 `sum.go`:

```go
package study

func Sum(values []int) int {
    total := 0
    for _, value := range values {
        total += value
    }
    return total
}
```

`sum_test.go`:

```go
package study

import "testing"

func TestSum(t *testing.T) {
    cases := []struct {
        name string
        input []int
        want int
    }{
        {"empty", nil, 0},
        {"positive", []int{1, 2, 3}, 6},
        {"mixed", []int{-2, 2}, 0},
    }
    for _, tc := range cases {
        t.Run(tc.name, func(t *testing.T) {
            if got := Sum(tc.input); got != tc.want {
                t.Fatalf("Sum(%v) = %d, want %d", tc.input, got, tc.want)
            }
        })
    }
}
```

## 실행

```sh
go test ./...
go test -cover ./...
go vet ./...
go test -race ./...
```

테스트가 성공하면 `ok`가 출력됩니다. race detector는 플랫폼과 C 도구 체인 지원이 필요할 수 있습니다. 지원하지 않는 환경에서는 일반 테스트 성공과 경쟁 검사 미실행을 구별하세요.

## 주의사항과 연습

테스트 함수는 `TestXxx(t *testing.T)`, 파일은 `_test.go`로 끝나야 합니다. 경계값·오류·취소 경로도 확인하세요. 커버리지는 실행한 코드의 지표이며 모든 경우의 정확성을 보장하지 않습니다. 단일 원소 테스트를 하나 더 추가하세요.

---

[언어 목차](../README.md) · [이전](../22.%20generics/README.md) · [다음](../24.%20string%20rune%20json/README.md)

## 동봉 실행 파일과 실행 방법

각 예제는 독립적으로 실행합니다. 추가 예제는 examples 하위 폴더에 분리했습니다. 소스 파일을 수정한 뒤 다시 실행하며, 컴파일 언어는 다시 빌드하세요.

### 예제 1

이 문서와 같은 폴더에서 실행합니다.

[sum.go](sum.go) · [sum_test.go](sum_test.go) · [go.mod](go.mod)

```sh
go test .
```

Go 1.22 이상을 사용합니다. 테스트 장은 main 대신 테스트 함수로 실행합니다.
