# For
**For란?** <br>
조건 또는 지정된 횟수에 따라 코드를 반복하는 반복문
> Golang에는 `while` Keyword가 없으며 `for`로 동일한 동작을 구현합니다.

<br>

## For Basic Structure
```go
for <Initialization>; <Condition>; <Post> {
    <Command>
}
```

## Example
### For Structure - 1
```go
package main

import "fmt"

func main() {
    for i := 1; i <= 10; i++ {
        fmt.Println(i)
    }
}
```

### For Structure - 2
```go
package main

import "fmt"

func main() {
    numbers := []int{1, 2, 3, 4, 5}

    for index, value := range numbers {
        fmt.Println(index, value)
    }
}
```

### While Style
```go
package main

import "fmt"

func main() {
    a := 1

    for a <= 10 {
        fmt.Println(a)
        a++
    }
}
```
