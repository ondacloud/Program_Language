class Cart:
    def __init__(self):
        self.items = []

    def add(self, item):
        self.items.append(item)

first = Cart()
second = Cart()
first.add("book")
print(first.items)
print(second.items)
