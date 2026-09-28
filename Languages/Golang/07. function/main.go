package main

import (
    "fmt"
)

func summarize(values ...int) (int, int) {
    total := 0
    for _, value := range values {
        total += value
    }
    return total, len(values)
}

func main() {
    sum, count := summarize(1, 2, 3)
    fmt.Println(sum, count)
    values := []int{4, 5}
    fmt.Println(summarize(values...))
}
