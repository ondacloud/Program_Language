package main

import (
    "fmt"
)

func main() {
    a, b := 7, 2
    fmt.Println(a/b, float64(a)/float64(b), a%b)
    fmt.Println(a > b, a == b)
    var active bool
    var count int
    fmt.Println(active, count)
}
