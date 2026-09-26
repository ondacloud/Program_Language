#include <stdio.h>
#include <string.h>

int main(void) {
    char text[16] = "Hello";
    printf("%zu %zu\n", strlen(text), sizeof text);
    int written = snprintf(text, sizeof text, "%s %d", "C", 17);
    if (written < 0 || (size_t)written >= sizeof text) {
        return 1;
    }
    printf("%s\n", text);
    return 0;
}
