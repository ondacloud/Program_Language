# Goroutine
**Goroutine이란?** <br>
Go Runtime이 관리하는 경량 실행 단위로 함수를 동시에 실행할 때 사용

<br>

## Goroutine Basic Structure
```go
go <Function>()
```

## Example
```go
package main

import (
    "fmt"
    "time"
)

func printMessage() {
    fmt.Println("Goroutine")
}

func main() {
    go printMessage()
    time.Sleep(time.Second)
}
```
