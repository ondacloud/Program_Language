package main

import (
    "fmt"
)

func main() {
    values := make([]int, 2, 5)
    scores := make(map[string]int)
    scores["a"] = 1
    fmt.Println(values, scores["a"])
}
