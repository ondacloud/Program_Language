package main

import (
    "fmt"
)

func main() {
    scores := map[string]int{"Alice": 0}
    value, exists := scores["Alice"]
    fmt.Println(value, exists)
    value, exists = scores["Bob"]
    fmt.Println(value, exists)
    delete(scores, "Alice")
    fmt.Println(len(scores))
}
