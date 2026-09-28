package main

import (
    "fmt"
)

func main() {
    values := make(chan int)
    go func() {
        defer close(values)
        for i := 1; i <= 3; i++ {
            values <- i
        }
    }()
    total := 0
    for value := range values {
        total += value
    }
    fmt.Println(total)
}
