#include <stdio.h>

int main(void) {
    FILE *file = fopen("example.txt", "r");
    if (file == NULL) {
        perror("fopen");
        return 1;
    }
    char line[128];
    while (fgets(line, sizeof line, file) != NULL) {
        fputs(line, stdout);
    }
    int failed = ferror(file);
    if (fclose(file) == EOF) {
        failed = 1;
    }
    return failed ? 1 : 0;
}
