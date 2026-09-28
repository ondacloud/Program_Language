#include <iostream>

int main() {
    int value = 3;
    int& alias = value;
    alias += 2;
    const int& view = value;
    auto copy = value;
    copy = 9;
    std::cout << view << ' ' << copy << '\n';
}
