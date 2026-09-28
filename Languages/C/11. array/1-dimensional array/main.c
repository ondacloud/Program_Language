#include <stdio.h>

int main(void) {
    int a[3] = {1, 2, 3};
    for (size_t i = 0; i < 3; i++) {
        printf("%d\n", a[i]);
    }
    return 0;
}
