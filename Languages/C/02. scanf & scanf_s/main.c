#include <stdio.h>

int main(void) {
    int age;
    char name[20];
    if (scanf("%d %19s", &age, name) != 2) {
        fputs("invalid input\n", stderr);
        return 1;
    }
    printf("%s: %d\n", name, age);
    return 0;
}
