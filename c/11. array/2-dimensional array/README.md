## 2-Dimensional Array Baic Structure
```c
#include <stdio.h>

int main(){
    <Data Type> <Variable>[<Array Size>][<Array Size>];
    return 0;
}
```

<br>

## Example
### 2-Dimensional Array Structure
```c
#include <stdio.h>

int main() {
    int a[5][5] = { {1, 2, 3, 4, 5}, {6, 7, 8, 9, 10} };

    for (int i = 0; i < 2; i++) {
        for (int j = 0; j < 5; j++) {
            printf("%d\n", a[i][j]);
        }
    }
    return 0;
}
```