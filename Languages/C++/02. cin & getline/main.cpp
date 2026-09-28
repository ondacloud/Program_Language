#include <iostream>
#include <string>

int main() {
    int age;
    std::string name;
    if (!(std::cin >> age)) { std::cerr << "invalid age\n"; return 1; }
    std::getline(std::cin >> std::ws, name);
    if (!std::cin) { std::cerr << "invalid name\n"; return 1; }
    std::cout << age << ' ' << name << '\n';
}
