package main

import (
    "fmt"
    "strconv"
)

func main() {
    text := strconv.Itoa(-123)
    fmt.Printf("%s %T\n", text, text)
}
