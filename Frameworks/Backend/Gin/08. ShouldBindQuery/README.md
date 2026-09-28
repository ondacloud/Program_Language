# ShouldBindQuery

## 개념과 사용 시점

쿼리 입력을 구조체로 묶고 형식·범위를 검사합니다.

## 준비와 실행

[과정 README](../README.md)의 설치를 먼저 완료합니다. 작업 폴더는 **Gin 과정 루트**입니다.

```powershell
python run.py "08. ShouldBindQuery/main.go"
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

type Paging struct {
	Limit int `form:"limit" binding:"gte=1,lte=100"`
}

func NewRouter() *gin.Engine {
	r := gin.New()
	r.Use(gin.Logger(), gin.Recovery())
	if err := r.SetTrustedProxies(nil); err != nil {
		panic(err)
	}
	r.GET("/", func(c *gin.Context) {
		query := Paging{Limit: 10}
		if err := c.ShouldBindQuery(&query); err != nil {
			c.JSON(400, gin.H{"error": "invalid limit"})
			return
		}
		c.JSON(200, gin.H{"limit": query.Limit})
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

기본 limit=10, limit=0은 400

## 주의사항

태그의 form 이름이 URL 매개변수와 연결됩니다.

## 연습

offset의 최솟값을 검사하세요.

[과정 목차](../README.md) · [Backend 목차](../../README.md)
