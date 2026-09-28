from pathlib import Path
import json
from loader import load

cases = json.loads(Path(__file__).with_name('cases.json').read_text(encoding='utf-8'))
count = 0
for lesson in cases:
    module = load(lesson['folder'] + '/app.py')
    module.app.config["TESTING"] = True
    with module.app.test_client() as client:
        for case in lesson['tests']:
            options = {}
            if case.get('body') is not None: options['json'] = case['body']
            response = client.open(case["path"], method=case["method"], follow_redirects=False, **options)
            assert response.status_code == case['status'], (lesson['folder'], case, response.status_code)
            if case.get('json') is not None: assert response.get_json() == case['json'], lesson['folder']
            if case.get('text') is not None: assert case['text'] in response.get_data(as_text=True), lesson['folder']
            count += 1
    for name in ['test_response', 'test_override']:
        if hasattr(module, name): getattr(module, name)()
    print('OK', lesson['folder'])
print(f'Passed {count} HTTP cases.')
