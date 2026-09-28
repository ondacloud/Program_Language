package main

import (
    "fmt"
)

func main() {
    value := 1
    if value < 0 {
        fmt.Println("negative")
    } else {
        fmt.Println("zero or positive")
    }
}
