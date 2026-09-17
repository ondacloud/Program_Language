# Method & Interface

## Method
**Method란?** <br>
특정 Type에 연결된 Function

```go
type User struct {
    Name string
}

func (u User) Hello() {
    fmt.Println("Hello", u.Name)
}
```

<br>

## Interface
**Interface란?** <br>
구현해야 하는 Method 집합을 정의하는 Type

```go
type Speaker interface {
    Speak()
}
```

## Example
```go
package main

import "fmt"

type Speaker interface {
    Speak()
}

type User struct {
    Name string
}

func (u User) Speak() {
    fmt.Println("Hello", u.Name)
}

func printSpeak(s Speaker) {
    s.Speak()
}

func main() {
    user := User{Name: "Alice"}
    printSpeak(user)
}
```
