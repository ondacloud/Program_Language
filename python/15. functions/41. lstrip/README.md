# Lstrip
**Lstrip란?** <br>
문자열에서 왼쪽(시작 부분)의 공백 문자 또는 지정한 문자를 제거할 때 사용하는 메서드

<br>

## Lstrip Basic Structure
```python
<String>.lstrip(<Chars>)
```
> `chars` (선택적): 제거할 문자의 집합을 지정합니다. 지정하지 않으면 기본적으로 공백 문자가 제거됩니다.

<br>

## Example
### Lstrip Structure
```python
text = "   apple"
stripped_text = text.lstrip()
print(stripped_text)

```
```python
text = "###apple###"
stripped_text = text.lstrip("#")
print(stripped_text)
```