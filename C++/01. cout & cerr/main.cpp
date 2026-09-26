#include <iostream>
#include <string>
#include <iomanip>

int main() {
    const std::string name = "Alice";
    std::cout << "Hello " << name << '\n';
    std::cout << std::fixed << std::setprecision(2) << 3.5 << '\n';
}
