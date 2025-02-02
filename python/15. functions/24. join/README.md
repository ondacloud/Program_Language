# Join
**Join?** <br>
반복 가능한 객체의 요소를 특정 구분자로 연결하여 하나의 문자열로 만들 때 사용하는 메서드

<br>

## Join Basic Structure
```python
<Separator>.join(<Iterable>)
```
> `separator`: 요소들 사이에 삽입할 구분자 문자열 <br> `iterable`: 연결할 요소들이 들어 있는 반복 가능한 객체 (리스트, 튜플 등)

<br>

## Example
### Join Structure
```python
words = ["apple", "banana", "cherry"]
result = ", ".join(words)
print(result)
```
```python
letters = ["a", "b", "c"]
result = "".join(letters)
print(result)
```