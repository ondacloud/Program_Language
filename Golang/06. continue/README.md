# Continue
**Continue란?** <br>
현재 반복의 남은 코드를 실행하지 않고 다음 반복으로 이동하는 Keyword

<br>

## Example
```go
package main

import "fmt"

func main() {
    for i := 1; i <= 10; i++ {
        if i <= 5 {
            continue
        }
        fmt.Println(i)
    }
}
```
