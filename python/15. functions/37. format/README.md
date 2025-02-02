# Format
**Format란?** <br>
문자열 안에 중괄호 {}를 사용하여 변수나 값을 삽입할 수 있게 해주는 메서드

<br>

## Format Basic Structure
```python
"String {}".format(<Value>)
```

<br>

## Example
### Format Structure
```python
name = "John"
age = 25

formatted_string = "My name is {} and I am {} years old.".format(name, age)
print(formatted_string)
```
```python
formatted_string = "My name is {0} and {1} is my age.".format(name, age)
print(formatted_string)
```
```python
formatted_string = "My name is {name} and I am {age} years old.".format(name=name, age=age)
print(formatted_string)
```