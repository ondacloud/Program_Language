#include <stdio.h>
int main(void) {
char name[20];
if (scanf_s("%19s", name, (unsigned)sizeof name) == 1) {
    printf("%s\n", name);
}
return 0;
}
