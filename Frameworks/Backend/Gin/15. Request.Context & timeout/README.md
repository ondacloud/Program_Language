# Request.Context & timeout

## 개념과 사용 시점

요청 Context로 취소·시간 제한을 전달합니다. DB·HTTP 호출도 이 Context를 받아야 중단할 수 있습니다.

## 준비와 실행

[과정 README](../README.md)의 설치를 먼저 완료합니다. 작업 폴더는 **Gin 과정 루트**입니다.

```powershell
python run.py "15. Request.Context & timeout/main.go"
```

서버 실행 후 다른 터미널에서 확인합니다. 요청 본문이 필요한 장은 아래 예제를 따르세요.

```powershell
curl.exe -i "http://127.0.0.1:8080/"
```

## 코드 읽기

```go
package main

import (
	"context"
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
	r.GET("/", func(c *gin.Context) {
		ctx, cancel := context.WithTimeout(c.Request.Context(), 20*time.Millisecond)
		defer cancel()
		select {
		case <-time.After(100 * time.Millisecond):
			c.JSON(200, gin.H{"ok": true})
		case <-ctx.Done():
			c.JSON(504, gin.H{"error": "timeout"})
		}
	})
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

약 20ms 뒤 504와 timeout

## 주의사항

time.After는 학습용입니다. Context를 만든 것만으로 취소를 무시하는 작업이 강제로 중단되지는 않습니다.

## 연습

작업 시간을 1ms로 바꾸고 200을 확인하세요.

[과정 목차](../README.md) · [Backend 목차](../../README.md)
