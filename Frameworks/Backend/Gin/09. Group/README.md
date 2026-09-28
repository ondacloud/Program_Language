# Group

## 개념과 사용 시점

라우트 그룹으로 경로 접두사와 공통 middleware를 묶습니다.

## 준비와 실행

[과정 README](../README.md)의 설치를 먼저 완료합니다. 작업 폴더는 **Gin 과정 루트**입니다.

```powershell
python run.py "09. Group/main.go"
```

서버 실행 후 다른 터미널에서 확인합니다. 요청 본문이 필요한 장은 아래 예제를 따르세요.

```powershell
curl.exe -i "http://127.0.0.1:8080/api/v1/students"
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
	api := r.Group("/api/v1")
	api.GET("/students", func(c *gin.Context) { c.JSON(200, gin.H{"students": []string{"Mina"}}) })
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

/api/v1/students에서 목록 반환

## 주의사항

Group은 별도 서버가 아닙니다. 경로 조합을 과도하게 중첩하지 마세요.

## 연습

관리자 그룹을 따로 설계하세요.

[과정 목차](../README.md) · [Backend 목차](../../README.md)
