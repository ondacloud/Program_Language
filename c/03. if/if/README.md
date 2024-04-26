# IF
**IF란?** <br>
조건이 참 일 때 실행되는 조건문 함수

<br>

## IF Basic Structure
```c
#include <stdio.h>

int main(){
    if (<Condition>){
        <Command>;
        ...
    }
    return 0;
}
```

<br>

## Example
### IF Sturecture
```c
#include <stdio.h>

int main(){
    int a;
    scanf_s("%d", &a);

    if (a < 0){
        printf("successed")
    }
    return 0;
}
```