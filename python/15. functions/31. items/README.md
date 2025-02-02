# Item
**Item이란?** <br>
딕셔너리에서 키-값 쌍을 반환할 때 사용하는 메서드

<br>

## Item Basic Structure
```python
<dict>.items()
```

<br>

## Example
### Item Structure
```python
my_dict = {"a": 1, "b": 2, "c": 3}

items = my_dict.items()
print(items)

for key, value in my_dict.items():
    print(key, value)
```