package main

import (
    "fmt"
    "strconv"
)

func main() {
    value, err := strconv.Atoi("123")
    if err != nil {
        fmt.Println(err)
        return
    }
    fmt.Println(value)
}
