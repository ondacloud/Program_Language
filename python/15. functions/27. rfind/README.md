# rFind
**rFind?** <br>
오른쪽으로부터 문자열 내부에서 특정문자가 어디에 위치하는지 찾을 때 사용하는 메서드
> 만약, 찾지 못한 경우 `-1`을 반환합니다.

<br>

## rFind Basic Structure
```python
<String>.rfind(<Substring>, <Start>, <End>)
```
> `substring`: 찾고자 하는 서브 문자열 <br> `start` (선택적): 검색을 시작할 인덱스 <br> `end` (선택적): 검색을 끝낼 인덱스

<br>

## Example
### rFind Structure
```python
text = "apple, banana, apple"
index = text.rfind("apple")
print(index)
```
```python
index = text.rfind("grape")
print(index)
```