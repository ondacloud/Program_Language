# if & AbortWithStatusJSON

## 개념과 사용 시점

입력 검증 실패 시 오류 JSON을 반환하고 이후 처리를 종료합니다. Abort는 체인을 중단하며 현재 함수는 return으로 끝냅니다.

## 준비와 실행

[과정 README](../README.md)의 설치를 먼저 완료합니다. 작업 폴더는 **Gin 과정 루트**입니다.

```powershell
python run.py "03. if & AbortWithStatusJSON/main.go"
```

서버 실행 후 다른 터미널에서 확인합니다. 요청 본문이 필요한 장은 아래 예제를 따르세요.

```powershell
curl.exe -i "http://127.0.0.1:8080/?score=80"
```

## 코드 읽기

```go
package main

import (
	"github.com/gin-gonic/gin"
	"log"
	"net/http"
	"strconv"
	"time"
)

func NewRouter() *gin.Engine {
	r := gin.New()
	r.Use(gin.Logger(), gin.Recovery())
	if err := r.SetTrustedProxies(nil); err != nil {
		panic(err)
	}
	r.GET("/", func(c *gin.Context) {
		score, err := strconv.Atoi(c.Query("score"))
		if err != nil || score < 0 || score > 100 {
			c.AbortWithStatusJSON(400, gin.H{"error": "invalid score"})
			return
		}
		result := "retry"
		if score >= 70 {
			result = "pass"
		}
		c.JSON(200, gin.H{"result": result})
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

score=80은 pass, abc·101은 400

## 주의사항

Abort만 호출한 뒤 현재 핸들러 코드를 계속 실행하지 않도록 return을 사용하세요.

## 연습

경계값 70을 검증하세요.

[과정 목차](../README.md) · [Backend 목차](../../README.md)
