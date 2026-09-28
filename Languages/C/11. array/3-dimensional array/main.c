#include <stdio.h>

int main(void) {
    int a[1][2][2] = {{{1, 2}, {3, 4}}};
    for (size_t i = 0; i < 1; i++) {
        for (size_t j = 0; j < 2; j++) {
            for (size_t k = 0; k < 2; k++) {
                printf("%d\n", a[i][j][k]);
            }
        }
    }
    return 0;
}
