#include <iostream>

class Counter {
    int value_;
public:
    explicit Counter(int value) : value_(value) {}
    void increment() { ++value_; }
    int get() const { return value_; }
};

int main() {
    Counter value{2};
    value.increment();
    std::cout << value.get() << '\n';
}
