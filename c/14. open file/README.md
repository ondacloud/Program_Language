# File Open
**File Open이란?** <br>
파일로부터 자료를 입출력하는 것

<br>

## File Open Basic Structure
```c
#include <stdio.h>

int main(){
    FILE *file = fopen("<File Name>", "Type");

    fclose(file);
    return 0;
}
```

<br>

## File Mode
|Type|Description|
|---|---|
|r|읽기 모드|
|w|쓰기 모드|
|a|추가 모드|
|x|새 파일 생성|
|b|바이너리 모드|
|t|텍스트 모드|

<br>

## Example
### File Open Structure
```c
#include <stdio.h>

int main() {
    FILE *file = fopen("example.txt", "r");
    if (file == NULL) {
        printf("파일을 열 수 없습니다.\n");
        return 1;
    }

    char line[100];
    while (fgets(line, sizeof(line), file)) {
        printf("%s", line);
    }

    fclose(file); 
    return 0;
}

```
```c
#include <stdio.h>

int main() {
    FILE *file = fopen("example.txt", "w");
    if (file == NULL) {
        printf("파일을 열 수 없습니다.\n");
        return 1;
    }

    fprintf(file, "Hello, World!\n");

    fclose(file);
    return 0;
}

```
```c
#include <stdio.h>

int main() {
    FILE *file = fopen("example.txt", "a");
    if (file == NULL) {
        printf("파일을 열 수 없습니다.\n");
        return 1;
    }

    fprintf(file, "Appending a new line.\n");

    fclose(file);
    return 0;
}
```