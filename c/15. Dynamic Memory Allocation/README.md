# File Open
**File Open이란?** <br>
프로그램 실행 중 malloc(), calloc(), realloc(), free() 함수를 사용하여 메모리를 할당 및 해제하는 기능

<br>

## File Open Basic Structure
```c
#include <stdio.h>
#include <stdlib.h>

int main(){
    <Data Type> *<Variable> = (<Data Type>*)malloc(sizeof(<Data Type>));
    
    free(<Variable>)
    return 0;
}
```

<br>

## Example
### File Open Structure
```c
#include <stdio.h>
#include <stdlib.h>

int main(){
    int *ptr = (int*)malloc(sizeof(int));
    *ptr = 10;

    printf("%d\n", *ptr);

    free(ptr);

    return 0;
}
```