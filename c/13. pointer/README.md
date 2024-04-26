# Pointer
**Pointer란?** <br>
메모리의 주소값을 저장하는 변수 / 포인터 변수

<br>

## Pointer Structure
```c
#include <stdio.h>

int main(){
    <Data Type> <Variable> = <Value>;
    <Data Type> *<Variable> = <Value>;

    return 0;
}
```

<br>

## Example
### Pointer Structure
```c
#include <stdio.h>

int main() {
    int num = 10;
    int* ptr = &num;

    printf("num = %d\n", num);
    printf("&num = %d\n", &num);
    printf("ptr = %d\n", ptr);
    printf("&ptr= %d\n", &ptr);
    printf("*ptr = %d\n", *ptr);

    return 0;
}
```