# 모듈과 패키지

## 시작하기

빈 연습 폴더에서 모듈을 초기화합니다. 모듈은 버전·의존성 관리 단위이고 패키지는 같은 디렉터리의 소스 파일을 묶는 단위입니다.

```sh
go mod init example.com/study
```

`main.go`:

```go
package main

import "fmt"

func main() {
    fmt.Println("Hello module")
}
```

```sh
go run .
go build .
go fmt ./...
go vet ./...
```

실행 결과는 `Hello module`입니다. `go run .`은 현재 패키지, `go run main.go`는 지정한 파일 목록을 대상으로 합니다.

## 구조와 의존성

- 실행 패키지는 `package main`과 `func main()`을 가집니다.
- 다른 패키지에서 사용할 이름은 대문자로 시작합니다. import 경로는 모듈 경로와 디렉터리 경로를 조합합니다.
- `go.mod`는 모듈 경로·언어 버전·의존성을, `go.sum`은 다운로드한 모듈의 체크섬을 기록합니다.
- 의존성을 추가·제거한 뒤 `go mod tidy`로 실제 import와 정합성을 맞춥니다. 필요한 의존성을 네트워크에서 받을 수 있습니다.
- `go` 지시문의 언어 버전과 설치한 도구 버전을 구분하세요. 이 정리는 Go 1.22 이상의 언어 동작을 기본으로 설명합니다.

## 직접 확인하기

같은 폴더에 helper.go를 추가하고 main에서 함수를 호출하세요. 두 파일의 package를 맞춘 뒤 go run .으로 실행합니다.

---

[언어 목차](../README.md) · [이전](../18.%20channel/README.md) · [다음](../20.%20defer%20panic%20recover/README.md)

## 동봉 실행 파일과 실행 방법

각 예제는 독립적으로 실행합니다. 추가 예제는 examples 하위 폴더에 분리했습니다. 소스 파일을 수정한 뒤 다시 실행하며, 컴파일 언어는 다시 빌드하세요.

### 예제 1

이 문서와 같은 폴더에서 실행합니다.

[main.go](main.go)

```sh
go run main.go
```

Go 1.22 이상을 사용합니다. 테스트 장은 main 대신 테스트 함수로 실행합니다.
