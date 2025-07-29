# For
**For이란?** <br>
지정한 횟수만큼 반복하는 함수

<br>

## For Bsic Structure

```java
public class Main {
    public static void main(String[] args) {
        for (int <Initial Formula>; <Condition>; <Increase/Decrease value) {
            <Command>;
            ...
        }
    }
}
```

<br>

## For Loop Structure
```java
public class Main {
    public static void main(String[] args) {
        for (;;) {
            <Command>;
            ...
        }
    }
}
```

<br>

## Example
### For Sturcture - 1
```java
public class Main {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
    }
}
```

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
```java
public class Main {
    public static void main(String[] args) {
        int i = 0;
        for (;;) {
            System.out.println(i);
            if (i >= 10) {
                break;
            }
            i++;
        }
    }
}

```