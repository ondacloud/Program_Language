# NoRoute & NoMethod

## 개념과 사용 시점

등록되지 않은 경로와 지원하지 않는 메서드에 대해 공통 응답을 정합니다.

## 준비와 실행

[과정 README](../README.md)의 설치를 먼저 완료합니다. 작업 폴더는 **Gin 과정 루트**입니다.

```powershell
python run.py "13. NoRoute & NoMethod/main.go"
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
	r.HandleMethodNotAllowed = true
	r.NoRoute(func(c *gin.Context) { c.JSON(404, gin.H{"error": "not_found"}) })
	r.NoMethod(func(c *gin.Context) { c.JSON(405, gin.H{"error": "method_not_allowed"}) })
	r.GET("/", func(c *gin.Context) { c.JSON(200, gin.H{"ok": true}) })
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

/missing은 404, POST /는 405

## 주의사항

경로 없음과 메서드 불일치를 같은 오류로 취급하지 마세요.

## 연습

Allow 헤더와 상태 코드를 확인하세요.

[과정 목차](../README.md) · [Backend 목차](../../README.md)
