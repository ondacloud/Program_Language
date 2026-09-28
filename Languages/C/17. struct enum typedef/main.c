#include <stdio.h>

typedef enum { INACTIVE, ACTIVE } Status;
typedef struct {
    const char *name;
    Status status;
} User;

int main(void) {
    User user = {"Alice", ACTIVE};
    User *ptr = &user;
    printf("%s %d\n", ptr->name, user.status);
    return 0;
}
