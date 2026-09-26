original = [[1]]
copied = original.copy()
copied[0].append(2)
print(original)
print(original is copied)
