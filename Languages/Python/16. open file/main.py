from tempfile import TemporaryDirectory
from pathlib import Path

with TemporaryDirectory() as directory:
    path = Path(directory) / "example.txt"
    with open(path, "w", encoding="utf-8") as file:
        file.write("Hello Python\n")
    with open(path, "r", encoding="utf-8") as file:
        print(file.read(), end="")
