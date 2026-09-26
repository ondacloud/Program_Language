package main

import (
    "fmt"
)

func main() {
    value := 0
    if value < 0 {
        fmt.Println("negative")
    } else if value == 0 {
        fmt.Println("zero")
    } else {
        fmt.Println("positive")
    }
}
