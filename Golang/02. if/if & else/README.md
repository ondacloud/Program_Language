# IF & ELSE
**IF & ELSE란?** <br>
조건이 참이면 IF Block을 실행하고, 거짓이면 ELSE Block을 실행하는 조건문

<br>

## IF & ELSE Basic Structure
```go
if <Condition> {
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
    a := 10

    if a >= 10 {
        fmt.Println("True")
    } else {
        fmt.Println("False")
    }
}
```
