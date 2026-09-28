package main

import (
    "fmt"
)

type User struct {
    Name string
    Age int
}

func main() {
    first := User{Name: "Alice", Age: 20}
    second := first
    second.Age = 30
    fmt.Println(first.Age, second.Age)
}
