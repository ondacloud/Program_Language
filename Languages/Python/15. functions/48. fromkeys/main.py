keys = ["a", "b"]
shared = dict.fromkeys(keys, [])
shared["a"].append(1)
print(shared)
independent = {key: [] for key in keys}
independent["a"].append(1)
print(independent)
