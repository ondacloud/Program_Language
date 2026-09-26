#include <stdio.h>

int main(void) {
    int values[] = {10, 20, 30};
    size_t count = sizeof values / sizeof values[0];
    for (size_t i = 0; i < count; i++) {
        printf("%d\n", values[i]);
    }
    return 0;
}
