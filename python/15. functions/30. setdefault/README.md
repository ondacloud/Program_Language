# Setdefault
**Setdefault이란?** <br>
주어진 함수에 의해 True로 평가되는 요소만 필터링하여 반환할 때 사용하는 함수

<br>

## Setdefault Basic Structure
```python
<dict>.setdefault(<key>, <default>)
```
> `key`: 찾을 키 <br> `default` (선택적): 키가 존재하지 않으면 추가할 기본값 (기본값은 None)

<br>

## Example
### Setdefault Structure
```python
my_dict = {"a": 1, "b": 2}

value = my_dict.setdefault("c", 3)
print(value)
print(my_dict)

value = my_dict.setdefault("b", 5)
print(value)
print(my_dict)
```