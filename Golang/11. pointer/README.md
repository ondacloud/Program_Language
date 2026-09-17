# Pointer
**Pointer란?** <br>
변수의 메모리 주소를 저장하고 해당 위치의 값을 직접 참조하기 위한 기능

<br>

## Pointer Basic Structure
```go
var <PointerName> *<Type>
<PointerName> = &<Variable>
```

<br>

## Example
```go
package main

import "fmt"

func main() {
    value := 10
    ptr := &value

    fmt.Println(value)
    fmt.Println(ptr)
    fmt.Println(*ptr)

    *ptr = 20
    fmt.Println(value)
}
```
