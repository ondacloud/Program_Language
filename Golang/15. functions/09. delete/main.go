package main

import (
    "fmt"
)

func main() {
    values := map[string]int{"a": 1}
    delete(values, "a")
    delete(values, "missing")
    fmt.Println(len(values))
}
