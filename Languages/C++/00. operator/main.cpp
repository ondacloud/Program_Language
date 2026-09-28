#include <iostream>

int main() {
    int n = 7;
    std::cout << n + 2 << ' ' << n / 2 << ' ' << n % 2 << '\n';
    n += 3;
    std::cout << n << ' ' << 7.0 / 2 << '\n';
    std::cout << std::boolalpha << (n == 10 && n > 0) << '\n';
    std::cout << (5 & 3) << ' ' << (5 | 3) << ' ' << (5 << 1) << '\n';
}
