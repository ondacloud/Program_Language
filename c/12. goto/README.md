# Goto
**Goto란?** <br>
프로그램의 흐름을 특정 위치로 이동시키는 제어문

<br>

## Goto Basic Structure
```c
#include <stdio.h>

int main(){
    <Function Name>:
    <Command>;
    ...

    goto <Function Name>;

    return 0;
}
```

<br>

## Example
### Goto Structure
```c
#include <stdio.h>

int main() {
    int a = 0;
    
    list_num:
    printf("%d\n", a);
    a++;

    if (a < 5) {
        goto list_num;
    }
    return 0;
}
```