#include <iostream>

template <typename T> T twice(T value) { return value + value; }

int main() {
    std::cout << twice(3) << ' ' << twice(2.5) << '\n';
}
