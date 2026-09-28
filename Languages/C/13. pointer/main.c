#include <stdio.h>

int main(void) {
    int value = 10;
    int *ptr = &value;
    printf("%d\n", *ptr);
    *ptr = 20;
    printf("%d\n", value);
    printf("%p\n", (void *)ptr);
    return 0;
}
