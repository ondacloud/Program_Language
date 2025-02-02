# Rjust
**Rjust란?** <br>
문자열을 오른쪽 정렬하고, 지정한 너비를 맞추기 위해 오른쪽에 특정 문자를 추가할 때 사용하는 메서드

<br>

## Rjust Basic Structure
```python
<String>.rjust(<Width>, <Fillchar>)
```
> `width`: 반환할 문자열의 최소 너비 <br> `fillchar` (선택적): 기본적으로는 공백을 사용하며, 다른 문자를 지정할 수도 있습니다.

<br>

## Example
### Rjust Structure
```python
text = "apple"
padded_text = text.rjust(10)
print(padded_text)
```
```python
padded_text = text.rjust(10, "-")
print(padded_text)
```