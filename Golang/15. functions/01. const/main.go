package main

import (
    "fmt"
)

func main() {
    const (
        Read = 1 << iota
        Write
        Execute
    )
    fmt.Println(Read, Write, Execute)
}
