# Update
**Update란?** <br>
딕셔너리에 다른 딕셔너리나 키-값 쌍을 추가하거나 기존의 값을 업데이트하는 데 사용하는 메서드

<br>

## Update Basic Structure
```python
dict.update(<Other>)
```
> `other`: 추가할 키-값 쌍을 포함한 딕셔너리, 또는 (key, value) 튜플의 반복 가능한 객체

<br>

## Example
### Update Structure
```python
my_dict = {"a": 1, "b": 2}

my_dict.update({"c": 3, "d": 4})
print(my_dict)

my_dict.update({"a": 10})
print(my_dict)
```
```python
my_dict.update([("e", 5), ("f", 6)])
print(my_dict)
```