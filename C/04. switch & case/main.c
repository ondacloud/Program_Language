#include <stdio.h>

int main(void) {
    int menu = 2;
    switch (menu) {
    case 1:
        puts("create");
        break;
    case 2:
    case 3:
        puts("read");
        break;
    default:
        puts("unknown");
        break;
    }
    return 0;
}
