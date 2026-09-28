# GET & POST & DELETE

## 개념과 사용 시점

HTTP 메서드별 등록 함수로 같은 URL의 작업을 나눕니다.

## 준비와 실행

[과정 README](../README.md)의 설치를 먼저 완료합니다. 작업 폴더는 **Gin 과정 루트**입니다.

```powershell
python run.py "05. GET & POST & DELETE/main.go"
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
	r.GET("/", func(c *gin.Context) { c.JSON(200, gin.H{"method": "GET"}) })
	r.POST("/", func(c *gin.Context) { c.JSON(201, gin.H{"method": "POST"}) })
	r.DELETE("/", func(c *gin.Context) { c.Status(204) })
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

GET 200, POST 201, DELETE 204. POST는 저장 형식 시연이며 영구 저장하지 않습니다.

## 주의사항

204 응답에는 본문을 넣지 않습니다. 이 예제는 미지원 메서드를 405로 처리하도록 설정했습니다.

## 연습

PUT 요청의 405를 확인하세요.

[과정 목차](../README.md) · [Backend 목차](../../README.md)
