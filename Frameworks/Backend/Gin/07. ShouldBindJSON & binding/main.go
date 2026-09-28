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
