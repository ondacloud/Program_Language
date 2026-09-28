# Context.JSON & Context.String

## 개념과 사용 시점

JSON은 구조화 응답, String은 일반 텍스트 응답을 만듭니다. 상태 코드를 첫 인자로 지정합니다.

## 준비와 실행

[과정 README](../README.md)의 설치를 먼저 완료합니다. 작업 폴더는 **Gin 과정 루트**입니다.

```powershell
python run.py "01. Context.JSON & Context.String/main.go"
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
	r.GET("/", func(c *gin.Context) { c.JSON(200, gin.H{"message": "hello"}) })
	r.GET("/text", func(c *gin.Context) { c.String(200, "hello %s", "Mina") })
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

/는 JSON, /text는 hello Mina

## 주의사항

fmt.Println은 서버 콘솔 출력입니다. 클라이언트 응답과 구분하세요.

## 연습

응답 Content-Type을 비교하세요.

[과정 목차](../README.md) · [Backend 목차](../../README.md)
