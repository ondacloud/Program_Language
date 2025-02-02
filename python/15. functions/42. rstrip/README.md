# Rstrip
**Rstrip란?** <br>
문자열에서 오른쪽(끝 부분)의 공백 문자 또는 지정한 문자를 제거할 때 사용하는 메서드

<br>

## Rstrip Basic Structure
```python
<String>.rstrip(<Chars>)
```
> `chars` (선택적): 제거할 문자의 집합을 지정합니다. 지정하지 않으면 기본적으로 공백 문자가 제거됩니다.

<br>

## Example
### Rstrip Structure
```python
text = "apple   "
stripped_text = text.rstrip()
print(stripped_text)

```
```python
text = "apple###"
stripped_text = text.rstrip("#")
print(stripped_text)
```