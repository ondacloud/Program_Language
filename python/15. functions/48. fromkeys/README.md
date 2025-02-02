# Fromkeys
**Fromkeys이란?** <br>
주어진 키에 대한 새로운 딕셔너리를 생성할 때 사용하는 메서드

<br>

## Fromkeys Basic Structure
```python
<dict>.fromkeys(<Iterable>, <Value>)
```
> `iterable`: 키로 사용할 반복 가능한 객체 <br> `value` (선택적): 각 키에 할당할 기본값 (지정하지 않으면 None)

<br>

## Example
### Fromkeys Structure
```python
keys = ["a", "b", "c"]

my_dict = dict.fromkeys(keys)
print(my_dict)

my_dict = dict.fromkeys(keys, 0)
print(my_dict)
```