# In
**In?** <br>
문자열, 리스트, 튜플, 집합 등에서 특정 요소가 포함되어 있는지 확인하는 데 사용하는 연산자
> 포함되어 있으면 `True`, 그렇지 않으면 `False`를 반환합니다. 

<br>

## In Basic Structure
```python
<Element> in <Iterable>
```
> `Element`: 확인할 요소 <br> `Iterable`: 요소를 검색할 대상 (문자열, 리스트, 튜플 등)

<br>

## Example
### In Structure
```python
text = "apple"
print("a" in text)
print("z" in text)
```
```python
numbers = [1, 2, 3, 4]
print(3 in numbers)
print(5 in numbers)
```