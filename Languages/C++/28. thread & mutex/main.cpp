#include <iostream>
#include <thread>
#include <mutex>

int main() {
    int count = 0;
    std::mutex mutex;
    auto work = [&] {
        for (int i = 0; i < 100; ++i) {
            std::lock_guard<std::mutex> lock(mutex);
            ++count;
        }
    };
    std::thread first(work), second(work);
    first.join(); second.join();
    std::cout << count << '\n';
}
