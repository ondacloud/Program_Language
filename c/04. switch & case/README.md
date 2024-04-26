# Switch & Case
**Switch & Case란?** <br>
변수의 값에 따라 코드를 실행하는 조건문 함수

<br>

## Switch & Case Basic Structure
```c
#include <stdio.h>

int main(){
    switch (<Condition>){
        case 0:
            <Command>;
            ...
            break;
        case 1:
            <Command>;
            ...
            break;
        ...
        default:
            <Command>;
            break;
        }
    return 0;
}
```

<br>

## Example
### Switch & Case Sturcture
```c
#include <stdio.h>

int main(){
    int a = 1;

    switch (a){
        case 1:
            printf("case 1");
            break;
        case 2:
            printf("case 2");
            break;
        default:
            printf("case deafult");
            break;
    }
}
```