# Zfill
**Zfill?** <br>
문자열의 왼쪽에 0을 추가하여 지정된 길이를 맞추는 메서드

<br>

## Zfill Basic Structure
```python
<String>.zfill(<Width>)
```

<br>

## Example
### Zfill Structure
```python
number = "42"
padded_number = number.zfill(5)
print(padded_number)
```
```python
number = "-42"
padded_number = number.zfill(5)
print(padded_number)
```