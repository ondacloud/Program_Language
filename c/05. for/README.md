# For
**For이란?** <br>
지정한 횟수만큼 반복하는 함수

<br>

## For Bsic Structure
```c
#include <stdio.h>

int main(){
    for (int <Initial Formula>; <Condition>; <Increase/Decrease value>){
        <Command>;
        ...
    }
    return 0;
}
```

<br>

## Example
### For Sturcture
```c
#include <stdio.h>

int main(){
    for (int i=1; i <= 10; i++){
        printf("%d\n", i);
        return 0;
    }
}
```