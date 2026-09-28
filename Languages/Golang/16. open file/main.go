package main

import (
    "fmt"
    "os"
    "path/filepath"
)

func main() {
    directory, err := os.MkdirTemp("", "go-study-")
    if err != nil { panic(err) }
    defer os.RemoveAll(directory)
    path := filepath.Join(directory, "example.txt")
    if err := os.WriteFile(path, []byte("Hello Go"), 0600); err != nil {
        panic(err)
    }
    data, err := os.ReadFile(path)
    if err != nil { panic(err) }
    fmt.Println(string(data))
}
