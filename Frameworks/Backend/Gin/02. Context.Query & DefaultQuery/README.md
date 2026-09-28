# Context.Query & DefaultQuery

## 개념과 사용 시점

쿼리 문자열을 읽고 누락 시 기본값을 지정합니다. 빈 값과 누락을 다르게 처리할지 결정하세요.

## 준비와 실행

[과정 README](../README.md)의 설치를 먼저 완료합니다. 작업 폴더는 **Gin 과정 루트**입니다.

```powershell
python run.py "02. Context.Query & DefaultQuery/main.go"
```

서버 실행 후 다른 터미널에서 확인합니다. 요청 본문이 필요한 장은 아래 예제를 따르세요.

```powershell
curl.exe -i "http://127.0.0.1:8080/?name=Mina"
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
	r.GET("/", func(c *gin.Context) { c.JSON(200, gin.H{"name": c.DefaultQuery("name", "guest")}) })
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

/?name=Mina는 Mina, 누락은 guest

## 주의사항

DefaultQuery는 빈 문자열이 전달된 경우에도 자동으로 기본값으로 바꾸는 기능이 아닙니다.

## 연습

공백·빈 값 정책을 추가하세요.

[과정 목차](../README.md) · [Backend 목차](../../README.md)
