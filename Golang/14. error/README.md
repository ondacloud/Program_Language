# Error
**Error란?** <br>
Golang에서 함수 실행 중 발생한 문제를 값으로 반환하여 처리하는 방식

<br>

## Error Basic Structure
```go
value, err := <Function>()
if err != nil {
    <Error Handling>
}
```

<br>

## Example
```go
package main

import (
    "errors"
    "fmt"
)

func divide(a float64, b float64) (float64, error) {
    if b == 0 {
        return 0, errors.New("cannot divide by zero")
    }
    return a / b, nil
}

func main() {
    result, err := divide(10, 0)
    if err != nil {
        fmt.Println(err)
        return
    }

    fmt.Println(result)
}
```

## Defer
```go
defer <Function>()
```
> 현재 함수가 종료되기 직전에 지정한 함수를 실행합니다.
