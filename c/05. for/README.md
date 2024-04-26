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

## For Loop Structure
```c
#include <stdio.h>

int main(){
    for (;;){
        <Command>;
        ...
    }
    return 0;
}
```

<br>

## Example
### For Sturcture - 1
```c
#include <stdio.h>

int main(){
    for (int i=1; i <= 10; i++){
        printf("%d\n", i);
        return 0;
    }
}
```

### For Sturcture - 2
```c
#include <stdio.h>

int main{
    int i=0;
    for(;;){
        printf()
        if (i <= 10){
            break;
        }
        i++;
    }
    return 0;
}
```