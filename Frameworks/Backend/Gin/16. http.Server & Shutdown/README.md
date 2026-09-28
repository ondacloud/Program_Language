# http.Server & Shutdown

## 개념과 사용 시점

http.Server를 직접 구성하면 타임아웃과 종료 정책을 명확히 관리할 수 있습니다. Shutdown은 진행 중인 요청 종료를 기다립니다.

## 준비와 실행

[과정 README](../README.md)의 설치를 먼저 완료합니다. 작업 폴더는 **Gin 과정 루트**입니다.

```powershell
python run.py "16. http.Server & Shutdown/main.go"
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
	"os"
	"os/signal"
	"time"
)

func NewRouter() *gin.Engine {
	r := gin.New()
	r.Use(gin.Logger(), gin.Recovery())
	if err := r.SetTrustedProxies(nil); err != nil {
		panic(err)
	}
	r.GET("/", func(c *gin.Context) { c.JSON(200, gin.H{"message": "ready"}) })
	return r
}

func main() {
	ctx, stop := signal.NotifyContext(context.Background(), os.Interrupt)
	defer stop()
	server := &http.Server{Addr: "127.0.0.1:8080", Handler: NewRouter(), ReadHeaderTimeout: 5 * time.Second}
	go func() {
		if err := server.ListenAndServe(); err != nil && err != http.ErrServerClosed {
			log.Print(err)
			stop()
		}
	}()
	<-ctx.Done()
	shutdown, cancel := context.WithTimeout(context.Background(), 5*time.Second)
	defer cancel()
	if err := server.Shutdown(shutdown); err != nil {
		log.Print(err)
	}
}
```

[실행 파일](main.go)

## 요청·예상 결과

GET /는 ready. 이 장의 main은 종료 신호를 받아 최대 5초간 정상 종료를 기다립니다.

## 주의사항

ListenAndServe가 ErrServerClosed를 반환하는 것은 정상 종료일 수 있습니다. 종료 제한 시간을 초과한 작업 정책도 정하세요.

## 연습

느린 요청 중 Ctrl+C를 눌러 동작을 관찰하세요.

[과정 목차](../README.md) · [Backend 목차](../../README.md)
