#include <iostream>
#include <initializer_list>

int main() {
    int total = 0;
    for (int i = 1; i <= 3; ++i) { total += i; }
    std::cout << total << '\n';
    for (int value : {10, 20}) { std::cout << value << '\n'; }
}
