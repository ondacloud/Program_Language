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
	r.GET("/", func(c *gin.Context) {
		score, err := strconv.Atoi(c.Query("score"))
		if err != nil || score < 0 || score > 100 {
			c.AbortWithStatusJSON(400, gin.H{"error": "invalid score"})
			return
		}
		result := "retry"
		if score >= 70 {
			result = "pass"
		}
		c.JSON(200, gin.H{"result": result})
	})
	return r
}

func main() {
	server := &http.Server{Addr: "127.0.0.1:8080", Handler: NewRouter(), ReadHeaderTimeout: 5 * time.Second}
	if err := server.ListenAndServe(); err != nil && err != http.ErrServerClosed {
		log.Fatal(err)
	}
}
