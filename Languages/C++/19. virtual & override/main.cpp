#include <iostream>
#include <string>

struct Animal {
    virtual ~Animal() = default;
    virtual std::string sound() const = 0;
};
struct Dog : Animal {
    std::string sound() const override { return "woof"; }
};

int main() {
    Dog dog;
    const Animal& animal = dog;
    std::cout << animal.sound() << '\n';
}
