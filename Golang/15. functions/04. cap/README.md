# Cap
**Cap이란?** <br>
Array 또는 Slice가 사용할 수 있는 전체 Capacity를 반환하는 내장 함수

## Basic Structure
```go
cap(<Value>)
```

## Example
```go
numbers := make([]int, 3, 10)
fmt.Println(cap(numbers))
```
