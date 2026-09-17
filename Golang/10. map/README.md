# Map
**Map이란?** <br>
Key와 Value 쌍으로 데이터를 저장하는 자료형

<br>

## Map Basic Structure
```go
<Variable> := map[<KeyType>]<ValueType>{
    <Key>: <Value>,
}
```

<br>

## Example
```go
package main

import "fmt"

func main() {
    users := map[string]int{
        "Alice": 20,
        "Bob":   25,
    }

    users["Charlie"] = 30
    fmt.Println(users["Alice"])
}
```

## Check Key
```go
value, exists := users["Alice"]
if exists {
    fmt.Println(value)
}
```
