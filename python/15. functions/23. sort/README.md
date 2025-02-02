# Sort
**Sort란?** <br>
리스트의 요소들을 오름차순으로 정렬할 때 사용하는 메서드

<br>

## Sort Basic Structure
```python
<list>.sort(reverse=False, key=None)
```
> `reverse`: True로 설정하면 내림차순 정렬 <br> `key`: 정렬 기준을 지정할 수 있는 함수

<br>

## Example
### Sort Structure
```python
numbers = [3, 1, 4, 1, 5, 9]
numbers.sort()
print(numbers)
```
```python
numbers.sort(reverse=True)
print(numbers)
```