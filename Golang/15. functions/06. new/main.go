package main

import (
    "fmt"
)

func main() {
    value := new(int)
    fmt.Println(*value)
    *value = 10
    fmt.Println(*value)
}
