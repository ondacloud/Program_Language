#include <stdio.h>

int main(void) {
    int count = 3;
    double price = 2.5;
    printf("count=%d price=%.2f\n", count, price);
    printf("%s %c %zu\n", "C", 'A', sizeof(char));
    return 0;
}
