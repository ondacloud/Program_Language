# Printf
**Printf란?** <br>
텍스트 출력하는 함수

<br>

## Printf Baic Structure
```c
#include <stdio.h>

int main(){
    printf("<Text>");
    return 0;
}
```

<br>

## Output Funtion

|Format Specifier|Description|
|---|---|
|%d|10진수 정수형|
|%ld|long 타입 10진수|
|%f|실수형|
|%lf|double 타입 실수형|
|%c|문자|
|%s|문자열|
|%o|8진수|
|%x|16진수|

<br>

## Example
### Printf Structure - 1
```c
#include <stdio.h>

int main(){
    printf("Hello World!");
    return 0;
}
```

### Printf Structure - 2
```c
#include <stdio.h>

int main() {
    char msg[] = "Hello World!";
    printf("%s", msg);
    return 0;
}
```