package main

import (
    "fmt"
)

func main() {
    values := []int{1}
    values = append(values, 2, 3)
    values = append(values, []int{4, 5}...)
    fmt.Println(values)
}
