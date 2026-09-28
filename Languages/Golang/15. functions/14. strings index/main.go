package main

import (
    "fmt"
    "strings"
)

func main() {
    fmt.Println(strings.Index("가Go", "Go"))
    fmt.Println(strings.Index("Go", "x"))
}
