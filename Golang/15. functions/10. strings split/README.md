# Strings Split
**Split이란?** <br>
문자열을 지정한 구분자를 기준으로 나누어 Slice로 반환하는 함수

## Basic Structure
```go
strings.Split(<String>, <Separator>)
```

## Example
```go
parts := strings.Split("a,b,c", ",")
fmt.Println(parts)
```
