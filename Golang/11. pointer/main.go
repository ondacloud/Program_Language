package main

import (
    "fmt"
)

func double(value *int) {
    *value *= 2
}

func main() {
    value := 10
    double(&value)
    fmt.Println(value)
}
