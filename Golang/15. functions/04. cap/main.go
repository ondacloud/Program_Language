package main

import (
    "fmt"
)

func main() {
    values := make([]int, 2, 5)
    fmt.Println(len(values), cap(values))
}
