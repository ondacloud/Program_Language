# Channel
**Channel이란?** <br>
Goroutine 간에 값을 안전하게 전달하기 위한 통신 통로

<br>

## Channel Basic Structure
```go
<Channel> := make(chan <Type>)
<Channel> <- <Value>
<Value> := <-<Channel>
```

## Example
```go
package main

import "fmt"

func main() {
    ch := make(chan string)

    go func() {
        ch <- "Hello Channel"
    }()

    message := <-ch
    fmt.Println(message)
}
```
