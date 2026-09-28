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
