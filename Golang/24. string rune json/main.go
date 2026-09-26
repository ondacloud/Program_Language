package main

import (
    "fmt"
    "encoding/json"
)

type User struct {
    Name string `json:"name"`
    Age int `json:"age"`
}

func main() {
    text := "가A"
    fmt.Println(len(text), len([]rune(text)))
    for index, value := range text {
        fmt.Printf("%d %c\n", index, value)
    }
    data, err := json.Marshal(User{Name: "Alice", Age: 20})
    if err != nil { panic(err) }
    fmt.Println(string(data))
}
