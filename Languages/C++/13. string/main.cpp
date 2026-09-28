#include <iostream>
#include <string>

int main() {
    std::string text = "Hello";
    text += " C++";
    std::cout << text << '\n';
    std::cout << text.size() << ' ' << text.substr(0, 5) << '\n';
}
