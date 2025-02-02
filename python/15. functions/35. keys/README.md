# Keys
**Keys란?** <br>
딕셔너리에서 모든 키를 반환할 때 사용하는 메서드
> 반환값은 `dict_keys` 객체로, 이는 반복 가능한 객체입니다.

<br>

## Keys Basic Structure
```python
<dict>.keys()
```

<br>

## Example
### Keys Structure
```python
my_dict = {"a": 1, "b": 2, "c": 3}

keys = my_dict.keys()
print(keys)

key_list = list(keys)
print(key_list)
```