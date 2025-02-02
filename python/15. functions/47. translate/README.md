# Translate
**Translate이란?** <br>
문자열 내 문자를 변환할 때 사용하는 메서드

<br>

## Translate Basic Structure
```python
<String>.translate(<Trans>)
```
> `trans`: Translate()로 생성된 변환 테이블

<br>

## Example
### Translate Structure
```python
trans = str.Translate("ab", "12")

text = "apple banana"
converted_text = text.translate(trans)
print(converted_text)
```