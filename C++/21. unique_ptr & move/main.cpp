#include <iostream>
#include <memory>
#include <utility>

int main() {
    auto first = std::make_unique<int>(42);
    auto second = std::move(first);
    std::cout << std::boolalpha << (first == nullptr) << ' ' << *second << '\n';
}
