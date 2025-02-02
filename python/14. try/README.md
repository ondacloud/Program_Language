# Try
**Try란?**  
예외가 발생할 가능성이 있는 코드를 실행하고, 예외 발생 시 적절한 처리를 하기 위한 코드 블록

<br>

## Try Basic Structure
```python
try:
    <command>
except ExceptionType:
    <command>
finally:
    <command>
```

<br>

## Example
### Try Structure
```python
try:
    num = int(input("Enter a number: "))
    result = 10 / num
    print("Result:", result)
except ZeroDivisionError:
    print("Cannot divide by zero.")
except ValueError:
    print("Please enter a valid number.")
finally:
    print("Program terminated.")
```

