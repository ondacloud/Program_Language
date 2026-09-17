# Strconv Atoi
**Atoi란?** <br>
문자열을 int Type으로 변환하는 함수

## Basic Structure
```go
strconv.Atoi(<String>)
```

## Example
```go
number, err := strconv.Atoi("123")
if err != nil {
    fmt.Println(err)
    return
}
fmt.Println(number)
```
