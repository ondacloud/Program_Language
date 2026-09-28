package main

import (
    "fmt"
    "sort"
)

func main() {
    values := []string{"b", "a", "c"}
    sort.Strings(values)
    fmt.Println(values)
}
