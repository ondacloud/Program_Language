# Context.HTML & template

## 개념과 사용 시점

Go html/template을 렌더링해 HTML을 반환합니다. 일반 변수는 HTML 문맥에 맞게 escape됩니다.

## 준비와 실행

[과정 README](../README.md)의 설치를 먼저 완료합니다. 작업 폴더는 **Gin 과정 루트**입니다.

```powershell
python run.py "14. Context.HTML & template/main.go"
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
	"html/template"
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
	r.SetHTMLTemplate(template.Must(template.New("hello").Parse("<h1>Hello, {{.name}}</h1>")))
	r.GET("/", func(c *gin.Context) { c.HTML(200, "hello", gin.H{"name": c.DefaultQuery("name", "Mina")}) })
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

Hello, Mina 제목

## 주의사항

외부 입력을 template.HTML로 강제 변환하면 escaping을 우회합니다.

## 연습

<script> 문자열이 태그가 아니라 텍스트로 출력되는지 확인하세요.

[과정 목차](../README.md) · [Backend 목차](../../README.md)
