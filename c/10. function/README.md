# Function
**Function이란?** <br>
특정 작업을 수행하고 결과를 반환하는 코드 블록

<br>

## Function Basic Structure
```c
#include <stdio.h>

int main(){
    <Function Name>();
}

<Data type> <Function Name>(<Variable>){
    <Command>;
    ...
    return <Value>
}
```

<br>

## Example
### Function Structure
```c
#include <stdio.h>

int main() {
    int a = 1, b = 2, c;
    c = sum_num(a, b);
    printf("%d", c);
    return 0;
}

int sum_num(int a, int b) {
    return a + b;
}
```