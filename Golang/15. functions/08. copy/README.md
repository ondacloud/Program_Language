# Copy
**Copy란?** <br>
한 Slice의 요소를 다른 Slice로 복사하는 내장 함수

## Basic Structure
```go
copy(<Destination>, <Source>)
```

## Example
```go
src := []int{1, 2, 3}
dst := make([]int, len(src))
copy(dst, src)
```
