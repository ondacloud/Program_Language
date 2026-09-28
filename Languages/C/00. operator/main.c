#include <stdio.h>

int main(void) {
    int a = 7, b = 2;
    printf("%d %.1f %d\n", a / b, (double)a / b, a % b);
    printf("%d %d\n", a > b, a == b);
    unsigned int flags = 5u;
    printf("%u\n", flags & 1u);
    return 0;
}
