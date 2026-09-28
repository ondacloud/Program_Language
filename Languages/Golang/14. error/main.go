package main

import (
    "fmt"
    "errors"
)

var ErrZero = errors.New("zero divisor")

func divide(a, b float64) (float64, error) {
    if b == 0 {
        return 0, ErrZero
    }
    return a / b, nil
}

func main() {
    _, err := divide(10, 0)
    if err != nil {
        wrapped := fmt.Errorf("calculate: %w", err)
        fmt.Println(wrapped)
        fmt.Println(errors.Is(wrapped, ErrZero))
    }
}
