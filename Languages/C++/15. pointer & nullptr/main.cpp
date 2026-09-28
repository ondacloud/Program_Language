#include <iostream>

int main() {
    int value = 3;
    int* ptr = &value;
    *ptr = 7;
    std::cout << value << '\n';
    ptr = nullptr;
    std::cout << std::boolalpha << (ptr == nullptr) << '\n';
}
