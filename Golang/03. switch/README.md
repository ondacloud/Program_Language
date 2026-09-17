# Switch
**Switch란?** <br>
변수나 표현식의 값에 따라 실행할 코드를 선택하는 조건문

<br>

## Switch Basic Structure
```go
switch <Value> {
case <Value1>:
    <Command>
case <Value2>:
    <Command>
default:
    <Command>
}
```

<br>

## Example
```go
package main

import "fmt"

func main() {
    a := 1

    switch a {
    case 1:
        fmt.Println("case 1")
    case 2:
        fmt.Println("case 2")
    default:
        fmt.Println("default")
    }
}
```
