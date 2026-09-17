# Break
**Break란?** <br>
반복문 또는 Switch 실행을 즉시 종료하는 Keyword

<br>

## Example
```go
package main

import "fmt"

func main() {
    for i := 1; i <= 10; i++ {
        fmt.Println(i)
        if i == 5 {
            break
        }
    }
}
```
