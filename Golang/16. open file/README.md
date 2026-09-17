# File Open
**File Open이란?** <br>
파일로부터 데이터를 읽거나 파일에 데이터를 쓰는 것

<br>

## File Read Basic Structure
```go
data, err := os.ReadFile(<File>)
```

## Example - Read
```go
package main

import (
    "fmt"
    "os"
)

func main() {
    data, err := os.ReadFile("example.txt")
    if err != nil {
        fmt.Println(err)
        return
    }

    fmt.Println(string(data))
}
```

## Example - Write
```go
package main

import (
    "fmt"
    "os"
)

func main() {
    err := os.WriteFile("example.txt", []byte("Hello, World!"), 0644)
    if err != nil {
        fmt.Println(err)
        return
    }
}
```

## os.Open Structure
```go
file, err := os.Open("example.txt")
if err != nil {
    return
}
defer file.Close()
```
> `defer file.Close()`를 사용하면 함수 종료 시 파일을 닫을 수 있습니다.
