def add_item(item, items=None):
    if items is None:
        items = []
    items.append(item)
    return items

def greet(name, *, prefix="Hello"):
    return f"{prefix}, {name}"

print(add_item("a"))
print(add_item("b"))
print(greet("Alice", prefix="Hi"))
