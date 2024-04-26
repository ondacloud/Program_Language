# Break
**Break란?** <br>
이하 실행문을 수행하지 않고 반복문을 끝내는 함수

<br>

## Example
### Break Structure
```c
#include <stdio.h>

int main(){
    for (int i=0; i <=10; i++){
        if (i == 5){
            break;
        }
    }
    return 0;
}
```