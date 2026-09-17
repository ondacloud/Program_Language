# IF & ELSE IF & ELSE
**IF & ELSE IF & ELSE란?** <br>
여러 조건을 순서대로 비교하여 조건에 맞는 코드 블록을 실행하는 조건문

<br>

## Basic Structure
```go
if <Condition> {
    <Command>
} else if <Condition> {
    <Command>
} else {
    <Command>
}
```

## Example
```go
package main

import "fmt"

func main() {
    score := 85

    if score >= 90 {
        fmt.Println("A")
    } else if score >= 80 {
        fmt.Println("B")
    } else {
        fmt.Println("C")
    }
}
```
