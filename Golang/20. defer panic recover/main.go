package main

import (
    "fmt"
)

func main() {
    defer fmt.Println("first")
    defer fmt.Println("second")
    value := 1
    defer fmt.Println("captured", value)
    value = 2
    fmt.Println("body", value)
}
