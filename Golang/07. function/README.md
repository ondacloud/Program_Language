# Function
**Function이란?** <br>
특정 작업을 수행하고 필요에 따라 값을 반환하는 코드 블록

<br>

## Function Basic Structure
```go
func <FunctionName>(<Parameter> <Type>) <ReturnType> {
    <Command>
    return <Value>
}
```

<br>

## Example
```go
package main

import "fmt"

func sumNum(a int, b int) int {
    return a + b
}

func main() {
    a := 1
    b := 2
    c := sumNum(a, b)
    fmt.Println(c)
}
```

## Multiple Return Values
```go
func calculate(a int, b int) (int, int) {
    return a + b, a - b
}
```
