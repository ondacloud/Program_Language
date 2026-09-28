#include <stdio.h>
#include <assert.h>

int main(void) {
    int values[] = {2, 4, 6};
    size_t count = sizeof values / sizeof values[0];
    assert(count == 3);
    int total = 0;
    for (size_t i = 0; i < count; i++) {
        total += values[i];
    }
    assert(total == 12);
    printf("%d\n", total);
    return 0;
}
