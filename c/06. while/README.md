# While
**While이란?** <br>
주어진 조건을 만족할 때까지 반복하는 함수

<br>

## While Basic Sturcture
```c
#include <stdio.h>

int main(){
    while (<Condition>) {
        <Command>;
        ...
    }
    return 0;
}
```

<br>

## While Loop Structure
```c
#include <stdio.h>

int main(){
    while (1){
        <Command>;
        ...
    }
    return 0;
}
```

<br>

## Example
### While Sturcture - 1
```c
#include <stdio.h>

int main(){
    int a=0;
    while (a <= 10) {
        printf("%d\n", a);
        a++;
    }
    return 0;
}
```

### While Sturcture - 2
```c
#include <stdio.h>

int main(){
    int a=0;
    while (1) {
        printf("%d", a);
        a++;

        if (a <= 10){
            break;
        }
    }
    return 0;
}
```