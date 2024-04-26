# Scanf & Scanf_s
**Scanf & Scanf_s란?** <br>
키보드로부터 데이터를 입력받는 함수

## Scanf Basic Structure
```c
#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>

int main(){
    int num;
    scanf("%d", &num);
    printf("%d", num);
    return 0;
}
```
> scanf 사용 시 코드 맨 위에 \#define _CRT_SECURE_NO_WARNINGS을 추가해주어야 합니다.

<br>

## Scanf_s Basic Structure
```c
#include <stdio.h>

int main(){
    int num;
    scanf_s("%d", &num);
    printf("%d", num);
    return 0;
}
```
> scanf_s의 s는 secure의 약자입니다.

<br>

## precautions
> %c or %s와 같이 문자나 문자열을 입력할 때는 아래와 같이 sizeof를 붙여주어야 합니다.
```c
#include <stdio.h>

int main(){
    char msg;
    scanf_s("%s", &msg, sizeof(msg));
    printf("%s", msg);
    return 0;
}
```