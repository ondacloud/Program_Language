#include <iostream>

struct Guard {
    Guard() { std::cout << "acquire\n"; }
    ~Guard() { std::cout << "release\n"; }
};

int main() {
    { Guard guard; std::cout << "body\n"; }
    std::cout << "after\n";
}
