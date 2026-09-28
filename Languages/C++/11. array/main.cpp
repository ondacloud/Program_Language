#include <iostream>
#include <array>

int main() {
    std::array<int, 3> values{10, 20, 30};
    std::cout << values.size() << ' ' << values.at(1) << '\n';
}
