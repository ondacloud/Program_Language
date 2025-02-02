# File Open
**File Open이란?** <br>
파일로부터 자료를 입출력하는 것

<br>

## File Open Basic Structure
```python
open(<File>, <Mode>, <Encoding>)
```
> `File`: 열 파일의 경로 <br> Mode (선택적): 파일을 여는 모드 (기본값: "r" 읽기 모드) <br> `Encoding` (선택적): 텍스트 파일의 인코딩 방식 (예: "utf-8")

<br>

## File Mode
|type|Description|
|---|---|
|r|읽기 모드|
|w|쓰기 모드|
|a|추가 모드|
|x|새 파일 생성|
|b|바이너리 모드|
|t|텍스트 모드|

<br>

## Example
### File Open Structure
```python
with open("example.txt", "r", encoding="utf-8") as file:
    content = file.read()
    print(content)
```
```python
with open("example.txt", "w", encoding="utf-8") as file:
    file.write("Hello, World!")

```
```python
with open("example.txt", "a", encoding="utf-8") as file:
    file.write("\nAppending a new line.")
```
> `with` 문을 사용하면 파일을 자동으로 닫아 메모리 누수를 방지할 수 있습니다.
