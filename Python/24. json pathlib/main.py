import json
from pathlib import Path
from tempfile import TemporaryDirectory

data = {"name": "Alice", "scores": [80, 90]}
with TemporaryDirectory() as directory:
    path = Path(directory) / "data.json"
    path.write_text(json.dumps(data, ensure_ascii=False, indent=2), encoding="utf-8")
    restored = json.loads(path.read_text(encoding="utf-8"))
    print(restored["name"], sum(restored["scores"]))
