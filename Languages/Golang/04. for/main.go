package main

import (
    "fmt"
)

func main() {
    numbers := []int{10, 20}
    for index, value := range numbers {
        fmt.Println(index, value)
    }
    count := 2
    for count > 0 {
        fmt.Println(count)
        count--
    }
}
