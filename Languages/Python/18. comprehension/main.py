numbers = [1, 2, 3, 4]
squares = [n * n for n in numbers if n % 2 == 0]
mapping = {n: n * n for n in numbers}
print(squares)
print(mapping[3])
