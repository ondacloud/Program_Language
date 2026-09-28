# Context.Param

## 개념과 사용 시점

콜론 이름으로 경로 변수를 등록하고 Param으로 읽습니다. 문자열이므로 별도 파싱과 검증이 필요합니다.

## 준비와 실행

[과정 README](../README.md)의 설치를 먼저 완료합니다. 작업 폴더는 **Gin 과정 루트**입니다.

```powershell
python run.py "06. Context.Param/main.go"
```

서버 실행 후 다른 터미널에서 확인합니다. 요청 본문이 필요한 장은 아래 예제를 따르세요.

```powershell
curl.exe -i "http://127.0.0.1:8080/students/3"
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
	r.GET("/students/:id", func(c *gin.Context) {
		id, err := strconv.Atoi(c.Param("id"))
		if err != nil || id < 1 {
			c.JSON(400, gin.H{"error": "invalid id"})
			return
		}
		c.JSON(200, gin.H{"id": id})
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

/students/3은 id=3, abc는 400

## 주의사항

경로 변수의 모양과 리소스 존재 여부는 다른 검증입니다.

## 연습

없는 양의 id에 404를 반환하세요.

[과정 목차](../README.md) · [Backend 목차](../../README.md)
