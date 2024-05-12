# While
**While이란?** <br>
주어진 조건을 만족할 때까지 반복하는 함수

<br>

## While Basic Sturcture
```python
while <Condition>:
    <Command>
    ...
```

<br>

## While Loop Structure
```python
while True:
    <Command>
    ...
```

<br>

## Example
### While Sturcture - 1
```python
a = 1

while a <= 10:
    print(a)
    a += 1
```

### While Sturcture - 2
```python
a = 1

while True:
    print(a)
    a += 1

    if a == 10:
        break

```