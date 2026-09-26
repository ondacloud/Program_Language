def make_counter():
    count = 0
    def next_count():
        nonlocal count
        count += 1
        return count
    return next_count

counter = make_counter()
print(counter(), counter())
