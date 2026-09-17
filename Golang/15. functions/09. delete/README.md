# Delete
**Delete란?** <br>
Map에서 지정한 Key를 삭제하는 내장 함수

## Basic Structure
```go
delete(<Map>, <Key>)
```

## Example
```go
users := map[string]int{"Alice": 20, "Bob": 25}
delete(users, "Alice")
```
