# Nonlocal
**Nonlocal이란?** <br>
중첩 함수에서 외부 함수의 변수를 수정할 때 사용

<br>

## Nonlocal Baic Structure
```python
nonlocal <variable>
```

<br>

## Example
### Nonlocal Structure
```python
def outer_function():
    y = 5

    def inner_function():
        nonlocal y
        y = 10

    inner_function()
    print(y)

outer_function()
```