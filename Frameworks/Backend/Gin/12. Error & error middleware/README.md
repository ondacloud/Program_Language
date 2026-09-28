# Error & error middleware

## 개념과 사용 시점

핸들러의 오류를 Context에 모으고 공통 middleware에서 응답을 결정할 수 있습니다.

## 준비와 실행

[과정 README](../README.md)의 설치를 먼저 완료합니다. 작업 폴더는 **Gin 과정 루트**입니다.

```powershell
python run.py "12. Error & error middleware/main.go"
```

서버 실행 후 다른 터미널에서 확인합니다. 요청 본문이 필요한 장은 아래 예제를 따르세요.

```powershell
curl.exe -i "http://127.0.0.1:8080/"
```

## 코드 읽기

```go
package main

import (
	"errors"
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
	r.Use(func(c *gin.Context) {
		c.Next()
		if len(c.Errors) > 0 && !c.Writer.Written() {
			c.JSON(500, gin.H{"error": "internal_error"})
		}
	})
	r.GET("/", func(c *gin.Context) { _ = c.Error(errors.New("demo failure")); c.Abort() })
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

500과 internal_error

## 주의사항

내부 오류 메시지를 그대로 외부에 반환하지 마세요. 상태 코드와 로그의 책임을 분리합니다.

## 연습

업무 오류와 시스템 오류를 구분하세요.

[과정 목차](../README.md) · [Backend 목차](../../README.md)
