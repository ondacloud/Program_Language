package main

import (
    "fmt"
)

func main() {
    base := []int{1, 2, 3}
    view := base[:2]
    view[0] = 9
    fmt.Println(base)
    independent := make([]int, len(view))
    copy(independent, view)
    independent[0] = 7
    fmt.Println(base, independent)
    fmt.Println(len(view), cap(view))
}
