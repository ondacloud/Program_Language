# Slice
**Slice란?** <br>
Array를 기반으로 하며 크기를 동적으로 변경할 수 있는 연속 데이터 구조

<br>

## Slice Basic Structure
```go
<Variable> := []<Type>{<Values>}
```

<br>

## Example
```go
package main

import "fmt"

func main() {
    numbers := []int{1, 2, 3}
    numbers = append(numbers, 4)

    fmt.Println(numbers)
}
```

## Make Structure
```go
numbers := make([]int, 3, 10)
```
> 두 번째 값은 Length, 세 번째 값은 Capacity입니다.
