# Array
**Array란?** <br>
동일한 자료형의 값을 고정된 크기로 저장하는 자료형
> Array의 Index는 `0`부터 시작합니다.

<br>

## Array Basic Structure
```go
var <Variable> [<Size>]<Type>
```

<br>

## Example
```go
package main

import "fmt"

func main() {
    numbers := [5]int{1, 2, 3, 4, 5}

    for i := 0; i < len(numbers); i++ {
        fmt.Println(numbers[i])
    }
}
```
