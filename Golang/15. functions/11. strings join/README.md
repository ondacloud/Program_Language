# Strings Join
**Join이란?** <br>
문자열 Slice를 지정한 구분자로 연결하여 하나의 문자열로 반환하는 함수

## Basic Structure
```go
strings.Join(<Slice>, <Separator>)
```

## Example
```go
words := []string{"Hello", "Golang"}
fmt.Println(strings.Join(words, " "))
```
