#include <stdio.h>

int main(void) {
    int a[2][2] = {{1, 2}, {3, 4}};
    for (size_t i = 0; i < 2; i++) {
        for (size_t j = 0; j < 2; j++) {
            printf("%d\n", a[i][j]);
        }
    }
    return 0;
}
