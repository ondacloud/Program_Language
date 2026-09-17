# Strings ReplaceAll
**ReplaceAll이란?** <br>
문자열 내의 모든 지정된 문자열을 새로운 문자열로 변경하는 함수

## Basic Structure
```go
strings.ReplaceAll(<String>, <Old>, <New>)
```

## Example
```go
text := strings.ReplaceAll("Hello World", "World", "Golang")
fmt.Println(text)
```
