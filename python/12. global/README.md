# Global
**Global이란?** <br>
함수 내부에서 전역 변수를 수정할 때 사용

<br>

## Global Baic Structure
```python
Global <variable>
```

<br>

## Example
### Global Structure
```python
x = 10

def modify_global():
    global x
    x = 20

modify_global()
print(x)
```