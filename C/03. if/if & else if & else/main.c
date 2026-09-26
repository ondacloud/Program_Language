#include <stdio.h>

int main(void) {
    int value = 0;
    if (value < 0) {
        puts("negative");
    } else if (value == 0) {
        puts("zero");
    } else {
        puts("positive");
    }
    return 0;
}
