# Use & Next

## 개념과 사용 시점

middleware는 핸들러 앞뒤 공통 처리를 수행합니다. Next로 다음 체인을 실행합니다.

## 준비와 실행

[과정 README](../README.md)의 설치를 먼저 완료합니다. 작업 폴더는 **Gin 과정 루트**입니다.

```powershell
python run.py "10. Use & Next/main.go"
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
	r.Use(func(c *gin.Context) { c.Header("X-Course", "Gin"); c.Next() })
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

ok=true와 X-Course 헤더

## 주의사항

응답이 이미 기록된 뒤 헤더를 바꾸면 적용되지 않을 수 있습니다. 공통 헤더는 다음 핸들러 전에 설정하세요.

## 연습

응답 후 처리 시간을 로그로 남기세요.

[과정 목차](../README.md) · [Backend 목차](../../README.md)
