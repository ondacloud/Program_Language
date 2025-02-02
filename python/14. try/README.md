# Try
**Try란?** <br>
예외가 발생할 가능성이 있는 코드를 실행하고, 예외 발생 시 적절한 처리를 하기 위한 코드 블록

<br>

## Try Basic Structure
```python
try:
    <command>
except <Exception Name>:
    <command>
finally:
    <command>
```

<br>

## Structure Description
|Function|Description|
|---|---|
|try| 에러 발생이 가능한 코드를 작성하는 곳|
|except|에러 발생 시 처리하는 코드를 작성하는 곳|
|finally|에러 여부와 상관없이 무조건 실행될 코드를 작성하는 곳|

<br>

## Exception Description
|Exception|Description|
|---|---|
|Exception|모든 예외의 상위 클래스 모든 예외 출력 가능|
|ValueError|값의 형식이 잘못되었을 때 발생|
|IndexError|범위를 벗어났을 때 발생|
|ZeroDivisionError|0으로 나눌 때 발생|
|TypeError|연산 중에 자료형이 다른 경우 발생|
|KeyError|사전에서 없는 키를 입력했을 때 발생|
|FileNotFoundError|존재하지 않는 파일을 불러올 때 발생|

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

