# Print
**Print란?** <br>
텍스트 출력하는 함수

<br>

## Print Baic Structure
```python
print("<Text>")
```

<br>

## Output Funtion

|Format Specifier|Description|
|---|---|
|%d|10진수 정수형|
|%f|실수형|
|%c|문자|
|%s|문자열|

<br>

## Option

|Format|Description|
|---|---|
|sep|구분자를 정의합니다.|
|end|출력값 뒤 공백을 정의합니다.|
|format|특정 서식에 따라 문자를 출력|

## Example
### Print Structure - 1
```python
print("Hello World!")
```

### Print Structure - 2
```python
print("%s" % "Hello World!")
```

<br>

## Option Example
### Sep Structure
```python
print('a', 'b', 'c', sep='+')
```

### End Sturecture
```python
print('a', 'b', 'c', end=' ')
print('d')
```

### Format Sturecture
```python
print("{0}, {1}, {0}".format(1, 2))
```