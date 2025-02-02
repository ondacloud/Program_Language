# Values
**Values란?** <br>
딕셔너리에서 모든 값을 반환할 때 사용하는 메서드
> 반환값은 `dict_Values` 객체로, 이는 반복 가능한 객체입니다.

<br>

## Values Basic Structure
```python
<dict>.values()

```

<br>

## Example
### Values Structure
```python
my_dict = {"a": 1, "b": 2, "c": 3}

values = my_dict.values()
print(values)

value_list = list(values)
print(value_list)
```