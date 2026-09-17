# Scan
**Scan이란?** <br>
표준 입력으로부터 값을 입력받는 함수

## Basic Structure
```go
fmt.Scan(&<Variable>)
```

## Example
```go
package main

import "fmt"

func main() {
    var name string
    fmt.Print("Enter your name: ")
    fmt.Scan(&name)
    fmt.Println(name)
}
```
