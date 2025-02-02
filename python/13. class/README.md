# Class
**Class란?** <br>
객체를 생성하기 위한 설계도로 속성과 메서드를 포함하는 코드 블록

<br>

## Class Baic Structure
```python
class <ClassName>:
    def __init__(self, attribute):
        self.attribute = attribute
```

<br>

## Example
### Class Structure
```python
class Example:
    def __init__(self, value):
        self.value = value

    def modify_value(self, new_value):
        self.value = new_value

obj = Example(10)
print(obj.value)

obj.modify_value(20)
print(obj.value)
```