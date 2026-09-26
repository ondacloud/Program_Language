command = ["move", 3, 4]
match command:
    case ["move", x, y] if x >= 0 and y >= 0:
        print(f"move to {x}, {y}")
    case ["stop"]:
        print("stop")
    case _:
        print("unknown")
