#include <stdio.h>
#include <stdlib.h>

int main(void) {
    int status = 1;
    int *value = malloc(sizeof *value);
    if (value == NULL) {
        goto cleanup;
    }
    *value = 10;
    printf("%d\n", *value);
    status = 0;
    cleanup:
    free(value);
    return status;
}
