package main

import (
    "fmt"
    "strings"
)

func main() {
    fmt.Printf("%q\n", strings.Split("a,,b", ","))
}
