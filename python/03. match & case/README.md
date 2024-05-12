# Match & Case
**Match & Case란?** <br>
변수의 값에 따라 코드를 실행하는 조건문 함수

<br>

## Match & Case Basic Structure
```python
match <Condition>:
    case 1:
        <Command>
        ...
    case 2:
        <Command>
        ...
    case _:
        <Command>
        ...
```

<br>

## Example
### Match & Case Sturcture
```python
a = 1

match a:
    case 1:
        print("case 1")
    case 2:
        print("case 2")
    case _:
        print("case deafult")
```