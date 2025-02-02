# Map
**Map이란?**
반복 가능한 객체의 요소에 함수를 적용하여 변환된 값을 반환하는 함수

<br>

## Map Basic Structure
```python
map(<function>, <iterable>)

```

<br>

## Example
### Map Structure
```python
numbers = ["1", "2", "3"]
int_numbers = list(map(int, numbers))
print(int_numbers)
```