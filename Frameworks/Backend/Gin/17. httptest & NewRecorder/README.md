# httptest & NewRecorder

## 개념과 사용 시점

net/http/httptest로 서버 포트 없이 라우터의 상태·본문을 확인합니다. NewRouter를 분리하면 테스트에서 같은 구성을 재사용할 수 있습니다.

## 준비와 실행

[과정 README](../README.md)의 설치를 먼저 완료합니다. 작업 폴더는 **Gin 과정 루트**입니다.

```powershell
python run.py "17. httptest & NewRecorder/main.go"
```

서버 실행 후 다른 터미널에서 확인합니다. 요청 본문이 필요한 장은 아래 예제를 따르세요.

```powershell
curl.exe -i "http://127.0.0.1:8080/"
```

## 코드 읽기

```go
package main

import (
	"github.com/gin-gonic/gin"
	"log"
	"net/http"
	"time"
)

func NewRouter() *gin.Engine {
	r := gin.New()
	r.Use(gin.Logger(), gin.Recovery())
	if err := r.SetTrustedProxies(nil); err != nil {
		panic(err)
	}
	r.GET("/", func(c *gin.Context) { c.JSON(200, gin.H{"message": "hello"}) })
	return r
}

func main() {
	server := &http.Server{Addr: "127.0.0.1:8080", Handler: NewRouter(), ReadHeaderTimeout: 5 * time.Second}
	if err := server.ListenAndServe(); err != nil && err != http.ErrServerClosed {
		log.Fatal(err)
	}
}
```

[실행 파일](main.go)

## 요청·예상 결과

GET은 hello. 과정 루트 python verify.py로 모든 main_test.go 실행

## 주의사항

포트 없는 테스트와 실제 네트워크 통합 검증은 범위가 다릅니다. 응답 본문뿐 아니라 상태·헤더도 검사하세요.

## 연습

없는 경로의 404 테스트를 추가하세요.

[과정 목차](../README.md) · [Backend 목차](../../README.md)
