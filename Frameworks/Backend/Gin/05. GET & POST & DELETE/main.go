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
	r.HandleMethodNotAllowed = true
	r.GET("/", func(c *gin.Context) { c.JSON(200, gin.H{"method": "GET"}) })
	r.POST("/", func(c *gin.Context) { c.JSON(201, gin.H{"method": "POST"}) })
	r.DELETE("/", func(c *gin.Context) { c.Status(204) })
	return r
}

func main() {
	server := &http.Server{Addr: "127.0.0.1:8080", Handler: NewRouter(), ReadHeaderTimeout: 5 * time.Second}
	if err := server.ListenAndServe(); err != nil && err != http.ErrServerClosed {
		log.Fatal(err)
	}
}
