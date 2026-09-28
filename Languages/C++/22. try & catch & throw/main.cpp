#include <iostream>
#include <stdexcept>

int main() {
    try { throw std::invalid_argument("bad input"); }
    catch (const std::exception& error) { std::cout << error.what() << '\n'; }
}
