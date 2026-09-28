#include <iostream>
#include <map>
#include <set>
#include <string>

int main() {
    std::map<std::string, int> counts;
    ++counts["a"]; ++counts["a"]; ++counts["b"];
    std::set<int> unique{3, 1, 3};
    std::cout << counts.at("a") << ' ' << unique.size() << '\n';
}
