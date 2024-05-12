## 1-Dimensional Array Baic Structure
```c
#include <stdio.h>

int main(){
    <Data Type> <Variable>[<Array Size>];
    return 0;
}
```

<br>

## Example
### 1-Dimensional Array Structure
```c
#include <stdio.h>

int main() {
    int a[5] = { 1, 2, 3, 4, 5};

    for (int i = 0; i < 5; i++) {
        printf("%d\n", a[i]);
    }
    return 0;
}
```