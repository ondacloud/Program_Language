# IF
**IF란?** <br>
조건이 참일 때 지정된 코드를 실행하는 조건문

<br>

## IF Basic Structure
```go
if <Condition> {
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
        fmt.Println("a is greater than or equal to 10")
    }
}
```
