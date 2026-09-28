# Set & Get

## 개념과 사용 시점

Context에 요청 범위의 값을 저장해 후속 핸들러가 읽게 할 수 있습니다.

## 준비와 실행

[과정 README](../README.md)의 설치를 먼저 완료합니다. 작업 폴더는 **Gin 과정 루트**입니다.

```powershell
python run.py "11. Set & Get/main.go"
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
	r.Use(func(c *gin.Context) { c.Set("course", "Gin"); c.Next() })
	r.GET("/", func(c *gin.Context) {
		value, exists := c.Get("course")
		c.JSON(200, gin.H{"course": value, "exists": exists})
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

course=Gin, exists=true

## 주의사항

Context는 요청 간 전역 저장소가 아닙니다. 타입 단언 실패와 키 충돌을 피하도록 규칙을 정하세요.

## 연습

GetString과 Get의 차이를 비교하세요.

[과정 목차](../README.md) · [Backend 목차](../../README.md)
