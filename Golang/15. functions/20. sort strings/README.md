# Sort Strings
**Strings란?** <br>
string Slice를 오름차순으로 정렬하는 함수

## Basic Structure
```go
sort.Strings(<Slice>)
```

## Example
```go
words := []string{"c", "a", "b"}
sort.Strings(words)
fmt.Println(words)
```
