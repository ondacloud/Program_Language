# Filter
**Filter란?** <br>
주어진 함수에 의해 True로 평가되는 요소만 필터링하여 반환할 때 사용하는 함수

<br>

## Filter Basic Structure
```python
filter(<Function>, <Iterable>)
```
> `function`: 각 요소를 검사할 함수. 이 함수는 `True` 또는 `False` 값을 반환해야 합니다. <br> `iterable`: 필터링할 반복 가능한 객체 (리스트, 튜플 등)

<br>

## Example
### Filter Structure
```python
numbers = [1, 2, 3, 4, 5, 6]

even_numbers = filter(lambda x: x % 2 == 0, numbers)
print(list(even_numbers))
```