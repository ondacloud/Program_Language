# New
**New란?** <br>
지정한 Type의 Zero Value를 생성하고 해당 값의 Pointer를 반환하는 내장 함수

## Basic Structure
```go
new(<Type>)
```

## Example
```go
value := new(int)
*value = 10
fmt.Println(*value)
```
