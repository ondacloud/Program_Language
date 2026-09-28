from pathlib import Path
import importlib.util, sys
ROOT = Path(__file__).resolve().parent
def load(relative):
    path = (ROOT / relative).resolve()
    if not path.is_relative_to(ROOT) or not path.is_file() or path.name != 'app.py':
        raise ValueError('과정 내부의 app.py 경로를 지정하세요.')
    name = 'course_example_' + str(abs(hash(str(path))))
    spec = importlib.util.spec_from_file_location(name, path)
    module = importlib.util.module_from_spec(spec)
    sys.modules[name] = module
    spec.loader.exec_module(module)
    return module
