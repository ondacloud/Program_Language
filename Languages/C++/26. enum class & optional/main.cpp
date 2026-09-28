#include <iostream>
#include <optional>

enum class Status { Ready, Done };

int main() {
    Status status = Status::Ready;
    std::optional<int> value = 7;
    std::cout << std::boolalpha << (status == Status::Ready) << ' ' << value.value_or(0) << '\n';
    value.reset();
    std::cout << value.value_or(0) << '\n';
}
