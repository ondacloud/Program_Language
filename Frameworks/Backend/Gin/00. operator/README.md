# operator

## 개념과 사용 시점

핸들러의 계산·조건은 Go 문법입니다. gin.H는 JSON 객체를 간단히 만드는 map 별칭입니다.

## 준비와 실행

[과정 README](../README.md)의 설치를 먼저 완료합니다. 작업 폴더는 **Gin 과정 루트**입니다.

```powershell
python run.py "00. operator/main.go"
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
	r.GET("/", func(c *gin.Context) { c.JSON(200, gin.H{"sum": 7 + 2, "division": 7.0 / 2, "passed": 80 >= 70}) })
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

sum=9, division=3.5, passed=true

## 주의사항

정수 7/2와 실수 7.0/2는 결과 타입과 값이 다릅니다.

## 연습

나머지 연산을 응답에 추가하세요.

[과정 목차](../README.md) · [Backend 목차](../../README.md)
