#include <iostream>
#include <vector>
#include <algorithm>

int main() {
    std::vector<int> values{3, 1, 2};
    std::sort(values.begin(), values.end(), [](int a, int b) { return a > b; });
    for (std::size_t i = 0; i < values.size(); ++i) {
        if (i) std::cout << ' ';
        std::cout << values[i];
    }
    std::cout << '\n';
}
