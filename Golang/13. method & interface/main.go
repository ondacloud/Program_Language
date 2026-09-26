package main

import (
    "fmt"
)

type Adder interface {
    Add(int)
}

type Counter struct { Value int }

func (c *Counter) Add(value int) {
    c.Value += value
}

func main() {
    counter := Counter{}
    var adder Adder = &counter
    adder.Add(3)
    fmt.Println(counter.Value)
}
