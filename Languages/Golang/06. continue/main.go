package main

import (
    "fmt"
)

func main() {
    for i := 1; i <= 4; i++ {
        if i%2 == 0 {
            continue
        }
        fmt.Println(i)
    }
}
