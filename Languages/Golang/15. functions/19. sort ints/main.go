package main

import (
    "fmt"
    "sort"
)

func main() {
    values := []int{3, 1, 2}
    sort.Ints(values)
    fmt.Println(values)
}
