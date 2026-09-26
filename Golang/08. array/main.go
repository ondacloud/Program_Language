package main

import (
    "fmt"
)

func main() {
    original := [3]int{1, 2, 3}
    copied := original
    copied[0] = 9
    fmt.Println(original)
    fmt.Println(copied)
}
