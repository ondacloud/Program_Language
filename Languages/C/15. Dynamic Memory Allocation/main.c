#include <stdio.h>
#include <stdlib.h>

int main(void) {
    size_t count = 3;
    int *values = malloc(count * sizeof *values);
    if (values == NULL) {
        return 1;
    }
    for (size_t i = 0; i < count; i++) {
        values[i] = (int)i + 1;
    }
    int *grown = realloc(values, 5 * sizeof *values);
    if (grown == NULL) {
        free(values);
        return 1;
    }
    values = grown;
    values[3] = 4;
    values[4] = 5;
    printf("%d %d\n", values[0], values[4]);
    free(values);
    values = NULL;
    return 0;
}
