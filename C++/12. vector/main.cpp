#include <iostream>
#include <vector>

int main() {
    std::vector<int> values{10, 20};
    values.push_back(30);
    values[0] = 5;
    std::cout << values.size() << ' ' << values.front() << ' ' << values.back() << '\n';
}
