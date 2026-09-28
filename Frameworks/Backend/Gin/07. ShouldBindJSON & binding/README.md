# ShouldBindJSON & binding

## 개념과 사용 시점

JSON을 구조체에 바인딩하고 binding 태그의 규칙을 검사합니다. exported 필드와 json 태그가 필요합니다.

## 준비와 실행

[과정 README](../README.md)의 설치를 먼저 완료합니다. 작업 폴더는 **Gin 과정 루트**입니다.

```powershell
python run.py "07. ShouldBindJSON & binding/main.go"
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

type Student struct {
	Name  string `json:"name" binding:"required,max=30"`
	Score int    `json:"score" binding:"gte=0,lte=100"`
}

func NewRouter() *gin.Engine {
	r := gin.New()
	r.Use(gin.Logger(), gin.Recovery())
	if err := r.SetTrustedProxies(nil); err != nil {
		panic(err)
	}
	r.POST("/", func(c *gin.Context) {
		var student Student
		if err := c.ShouldBindJSON(&student); err != nil {
			c.JSON(400, gin.H{"error": "invalid student"})
			return
		}
		c.JSON(201, student)
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

POST {"name":"Mina","score":80}은 201. GET은 404입니다.

```powershell
Invoke-RestMethod http://127.0.0.1:8080/ -Method Post -ContentType application/json -Body '{"name":"Mina","score":80}'
```

## 주의사항

ShouldBindJSON은 오류를 반환하므로 응답 정책을 직접 정할 수 있습니다. score의 0은 유효하므로 required 태그를 무심코 붙이지 않습니다.

## 연습

공백 이름을 거절하세요.

[과정 목차](../README.md) · [Backend 목차](../../README.md)
