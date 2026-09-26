#include <iostream>

int main() {
    for (int n = 0; n < 4; ++n) {
        if (n == 2) { continue; }
        std::cout << n << '\n';
    }
}
