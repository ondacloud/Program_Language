# Do & While
**Do & While이란?** <br>
주어진 조건을 만족할 때 반복하는 함수

<br>

## Do & While Basic Sturcture
```c
#include <stdio.h>

int main(){
    do {
        <Command>;
        ...
    } while (<Condition>):
    return 0;
}
``` 

<br>

## Example
### Do & While Sturcture
```c
#include <stdio.h>

int main(){
    int a=0;
    do {
        printf("%d\n", a)
    } while (a <= 10):
    return 0;
}
```