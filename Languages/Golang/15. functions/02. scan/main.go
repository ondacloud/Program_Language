package main

import (
    "fmt"
)

func main() {
    var name string
    var age int
    if n, err := fmt.Scan(&name, &age); err != nil || n != 2 {
        fmt.Println("invalid input")
        return
    }
    fmt.Println(name, age)
}
