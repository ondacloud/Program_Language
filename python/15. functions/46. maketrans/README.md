# Maketrans
**Maketrans이란?** <br>
문문자열 내 모든 대문자를 소문자로 변환할 때 사용하는 메서드

<br>

## Maketrans Basic Structure
```python
str.maketrans(<x>, <y>, <z>)
```
> `x`: 변환할 문자들의 문자열 <br> `y`: x에서 지정한 문자들을 변환할 대상 문자들의 문자열 <br> `z` (선택적): 삭제할 문자들의 문자열

<br>

## Example
### Maketrans Structure
```python
trans = str.maketrans("ab", "12")

text = "apple banana"
converted_text = text.translate(trans)
print(converted_text)
```
```python
trans = str.maketrans("ab", "12", "e")

text = "apple banana"
converted_text = text.translate(trans)
print(converted_text)
```