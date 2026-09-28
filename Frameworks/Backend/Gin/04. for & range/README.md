# for & range

## 개념과 사용 시점

Go range로 슬라이스를 순회하고 조건에 맞는 값을 새 슬라이스에 추가합니다.

## 준비와 실행

[과정 README](../README.md)의 설치를 먼저 완료합니다. 작업 폴더는 **Gin 과정 루트**입니다.

```powershell
python run.py "04. for & range/main.go"
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
	r.GET("/", func(c *gin.Context) {
		passed := []int{}
		for _, score := range []int{60, 80, 90} {
			if score >= 70 {
				passed = append(passed, score)
			}
		}
		c.JSON(200, gin.H{"passed": passed})
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

passed=[80,90]

## 주의사항

nil 슬라이스는 JSON null, 빈 슬라이스는 []로 직렬화될 수 있습니다. API 계약에 맞게 선택하세요.

## 연습

합계와 평균을 계산하세요.

[과정 목차](../README.md) · [Backend 목차](../../README.md)
