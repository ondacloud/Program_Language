# Go 학습 가이드

문법을 읽고 직접 실행하면서 동작 원리와 실패 조건을 확인하는 한국어 학습 노트입니다. 기본 설명 기준은 **Go 1.22 이상**입니다. 이는 최신 버전이라는 뜻이 아니라 예제의 학습 기준입니다.

## 권장 학습 순서

변수·연산·입출력 → 조건·반복·함수 → 배열·slice·map → struct·interface·error → 고루틴·채널 → 모듈·취소·테스트

폴더 번호는 기존 경로를 유지하기 위한 번호입니다. 새로 보강된 기초 주제는 뒤 번호에 있어도 위 순서에 맞춰 함께 읽으세요. 각 문서는 독립적인 예제이므로 같은 이름의 클래스나 함수를 한 파일에 모두 붙이지 않습니다.

## 첫 프로그램 실행

`main.go` 파일에 저장하세요.

```go
package main

import (
    "fmt"
)

func main() {
    fmt.Println("Hello Go")
}
```

```sh
go run main.go
```

`go version`으로 설치를 확인하세요. 패키지 단위 작업은 별도 폴더에서 `go mod init example.com/study` 후 시작합니다. `go fmt ./...`, `go vet ./...`, `go test ./...`를 함께 익히세요.

## 문서 읽는 방법

1. 핵심 개념을 읽고 실행 결과를 먼저 예상합니다.
2. 예제를 실행하고 출력과 원본 데이터 변경을 관찰합니다.
3. 빈 값, 경계값, 잘못된 입력도 시도합니다.
4. 직접 확인하기 문제로 코드를 바꿔 봅니다.

전체 프로그램과 부분 예제를 구별하세요. 부분 예제는 해당 설명에 나온 위치에 넣고, 다중 파일 예제는 파일별로 저장합니다. 주소·스레드 순서·현재 시간 등은 실행마다 다를 수 있습니다.

## 전체 목차

| 번호 | 주제 |
|---|---|
| 00 | [Go 자료형과 연산자](00.%20operator/README.md) |
| 01 | [출력 — fmt](01.%20print/README.md) |
| 02 | [if / else if / else](02.%20if/README.md) |
| 03 | [switch — 값과 조건 분기](03.%20switch/README.md) |
| 04 | [for와 range](04.%20for/README.md) |
| 05 | [break — 반복 종료](05.%20break/README.md) |
| 06 | [continue — 다음 반복](06.%20continue/README.md) |
| 07 | [함수 — 값 전달, 다중 반환, 가변 인수](07.%20function/README.md) |
| 08 | [배열 — 길이도 타입의 일부](08.%20array/README.md) |
| 09 | [슬라이스 — 길이, 용량, 기저 배열](09.%20slice/README.md) |
| 10 | [map — 키 조회와 존재 여부](10.%20map/README.md) |
| 11 | [포인터 — 주소와 값 변경](11.%20pointer/README.md) |
| 12 | [구조체 — 값 묶기](12.%20struct/README.md) |
| 13 | [메서드와 인터페이스](13.%20method%20%26%20interface/README.md) |
| 14 | [오류 — error 값과 wrapping](14.%20error/README.md) |
| 15 | [함수·메서드·문법 빠른 찾기](15.%20functions/README.md) |
| 16 | [파일 읽기와 쓰기](16.%20open%20file/README.md) |
| 17 | [고루틴 — 완료 대기와 공유 상태](17.%20goroutine/README.md) |
| 18 | [채널 — 전달, close, range](18.%20channel/README.md) |
| 19 | [모듈과 패키지](19.%20module%20package/README.md) |
| 20 | [defer, panic, recover](20.%20defer%20panic%20recover/README.md) |
| 21 | [context와 select — 취소 전달](21.%20context%20select/README.md) |
| 22 | [제네릭 — 타입 매개변수](22.%20generics/README.md) |
| 23 | [테스트와 도구](23.%20testing/README.md) |
| 24 | [문자열, rune, JSON](24.%20string%20rune%20json/README.md) |

## 공식 참고 자료

- [언어 명세](https://go.dev/ref/spec)
- [공식 튜토리얼](https://go.dev/doc/tutorial/)
- [표준 라이브러리](https://pkg.go.dev/std)
- [동기화 도구](https://pkg.go.dev/sync)

[전체 언어 가이드](../../README.md)

## 동봉 실행 파일과 실행 방법

각 예제는 독립적으로 실행합니다. 추가 예제는 examples 하위 폴더에 분리했습니다. 소스 파일을 수정한 뒤 다시 실행하며, 컴파일 언어는 다시 빌드하세요.

### 예제 1

이 문서와 같은 폴더에서 실행합니다.

[main.go](main.go)

```sh
go run main.go
```

Go 1.22 이상을 사용합니다. 테스트 장은 main 대신 테스트 함수로 실행합니다.

## 동봉 파일 안내

각 주제 문서의 **동봉 실행 파일과 실행 방법**에서 소스 파일과 실행 명령을 확인하세요. 각 주제 문서의 실행 방법을 확인하세요.
