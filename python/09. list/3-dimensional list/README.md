## 3-Dimensional List Baic Structure
```python
<Variable> = [[<List Size>], [<List Size>], [<List Size>]]
```

<br>

## Example
### 3-Dimensional List Structure
```python
a = [[[1, 2, 3, 4, 5], [6, 7, 8, 9, 10], [11, 12, 13, 14, 15]]]

for i in range(0, 1):
    for j in range(0, 3):
        for k in range(0, 5):
            print(a[i][j][k])
```