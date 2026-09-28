#include <iostream>
#include <fstream>
#include <string>

int main() {
    std::ifstream file("sample.txt");
    if (!file) { std::cerr << "open failed\n"; return 1; }
    std::string line;
    while (std::getline(file, line)) { std::cout << line << '\n'; }
    if (file.bad()) { return 1; }
}
