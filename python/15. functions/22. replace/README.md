# Replace
**Replace란?** <br>
문자열에서 특정 부분을 다른 문자열로 바꿀 때 사용하는 메서드

<br>

## Replace Basic Structure
```python
<String>.replace(<old>, <new>, <count>)
```
> `old`: 변경할 대상 문자열 <br> `new`: 새로운 문자열 <br> `count` (선택적): 변경할 최대 횟수 (기본값은 모든 항목)

<br>

## Example
### Replace Structure
```python
text = "apple apple apple"
new_text = text.replace("apple", "orange")
print(new_text)
```