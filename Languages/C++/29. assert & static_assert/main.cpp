#include <iostream>
#include <cassert>

int add(int a, int b) { return a + b; }

int main() {
    static_assert(sizeof(char) == 1, "char size unit");
    assert(add(2, 3) == 5);
    assert(add(-1, 1) == 0);
    std::cout << "checks passed\n";
}
