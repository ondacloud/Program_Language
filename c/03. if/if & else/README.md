# IF & ELSE
**IF & ELSE란?** <br>
조건이 참과 거짓일 때 실행되는 조건문 함수

<br>

## IF & ELSE Basic Structure
```c
#include <stdio.h>

int main(){
    if (<Condition>){
        <Command>;
        ...
    }
    else {
        <Command>;
        ...
    }
    return 0;
}
```

<br>

## Example
### IF & ELSE Sturecture
```c
#include <stdio.h>

int main(){
    int a;
    scanf_s("%d", &a);

    if (a < 0){
        printf("successed")
    }
    else {
        printf("failed")
    }
    return 0;
}
```