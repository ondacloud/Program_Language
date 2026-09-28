package main

import (
    "fmt"
)

func main() {
    src := []int{1, 2, 3}
    dst := make([]int, 2)
    fmt.Println(copy(dst, src))
    fmt.Println(dst)
}
