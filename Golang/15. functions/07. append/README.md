# Append
**Append란?** <br>
Slice의 끝에 값을 추가하는 내장 함수

## Basic Structure
```go
<slice> = append(<slice>, <Value>)
```

## Example
```go
numbers := []int{1, 2, 3}
numbers = append(numbers, 4)
fmt.Println(numbers)
```
