# Get
**Get이란?** <br>
딕셔너리에서 특정 키의 값을 반환할 때 사용하는 메서드
> 만약, 키가 존재하지 않으면 `None`을 반환하며, 두 번째 인수로 기본값을 지정할 수 있습니다.

<br>

## Get Basic Structure
```python
dict.get(<Key>, <ㅇefault>)
```
> `other`: 추가할 키-값 쌍을 포함한 딕셔너리, 또는 (key, value) 튜플의 반복 가능한 객체

<br>

## Example
### Get Structure
```python
my_dict = {"a": 1, "b": 2}

value = my_dict.get("a")
print(value)

value = my_dict.get("c")
print(value)

value = my_dict.get("c", 0)
print(value)
```