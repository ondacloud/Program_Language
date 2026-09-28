#include <stdio.h>

int square(int value);  // 함수 선언

int square(int value) { // 함수 정의
    return value * value;
}

int main(void) {
    int value = 3;
    printf("%d\n", square(value));
    printf("%d\n", value);
    return 0;
}
