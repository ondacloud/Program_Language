#include <iostream>

int main() {
    int menu = 2;
    switch (menu) {
    case 1: std::cout << "open\n"; break;
    case 2: std::cout << "save\n"; break;
    default: std::cout << "unknown\n";
    }
}
