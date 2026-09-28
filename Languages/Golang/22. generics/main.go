package main

import (
    "fmt"
)

func Contains[T comparable](values []T, target T) bool {
    for _, value := range values {
        if value == target {
            return true
        }
    }
    return false
}

func main() {
    fmt.Println(Contains([]int{1, 2, 3}, 2))
    fmt.Println(Contains([]string{"a", "b"}, "x"))
}
