# PopItem
**PopItem이란?** <br>
딕셔너리에서 임의의 키-값 쌍을 제거하고 반환할 때 사용하는 메서드

<br>

## PopItem Basic Structure
```python
<dict>.popitem()
```

<br>

## Example
### PopItem Structure
```python
my_dict = {"a": 1, "b": 2, "c": 3}

item = my_dict.popitem()
print(item)
print(my_dict)
```