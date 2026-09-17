# Struct
**Struct란?** <br>
서로 다른 자료형의 여러 필드를 하나의 자료형으로 묶기 위한 사용자 정의 타입

<br>

## Struct Basic Structure
```go
type <StructName> struct {
    <FieldName> <Type>
}
```

<br>

## Example
```go
package main

import "fmt"

type User struct {
    Name string
    Age  int
}

func main() {
    user := User{Name: "Alice", Age: 20}
    fmt.Println(user.Name)
    fmt.Println(user.Age)
}
```
