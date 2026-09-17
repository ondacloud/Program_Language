# Print
**Print란?** <br>
텍스트 또는 변수 값을 표준 출력으로 출력하는 기능

<br>

## Print Basic Structure
```go
fmt.Print(<Value>)
fmt.Println(<Value>)
fmt.Printf("<Format>", <Value>)
```
> `fmt` Package를 사용하기 위해 `import "fmt"`가 필요합니다.

<br>

## Output Function
|Function|Description|
|---|---|
|fmt.Print|줄바꿈 없이 출력합니다.|
|fmt.Println|출력 후 줄바꿈합니다.|
|fmt.Printf|Format Specifier를 사용하여 출력합니다.|

<br>

## Format Specifier
|Format Specifier|Description|
|---|---|
|%d|10진수 정수형|
|%f|실수형|
|%c|문자|
|%s|문자열|
|%t|Boolean|
|%v|기본 형식으로 값 출력|
|%T|자료형 출력|

<br>

## Example
### Print Structure - 1
```go
package main

import "fmt"

func main() {
    fmt.Println("Hello World!")
}
```

### Print Structure - 2
```go
package main

import "fmt"

func main() {
    name := "Golang"
    fmt.Printf("Hello %s!\n", name)
}
```
