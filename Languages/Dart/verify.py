from pathlib import Path
import argparse, json, os, shutil, subprocess, sys
root = Path(__file__).resolve().parent
parser = argparse.ArgumentParser(description='언어 예제의 실행 결과를 확인합니다.')
parser.add_argument('--sdk', help='SDK 실행 파일 경로; 생략 시 PATH에서 찾음')
args = parser.parse_args()
tool = args.sdk or shutil.which('dart')
if not tool: parser.error('README의 SDK 설치 안내를 먼저 완료하세요.')
cases = json.loads((root/'cases.json').read_text(encoding='utf-8'))
environment = os.environ.copy()
environment['DOTNET_CLI_TELEMETRY_OPTOUT'] = '1'
environment['DOTNET_NOLOGO'] = '1'
for case in cases:
    folder = root / case['folder']
    command = [tool, 'run', str(folder/'main.dart')]
    result = subprocess.run(command, input=(case['input'] or '')+'\n', cwd=root, env=environment, capture_output=True, text=True, encoding='utf-8', timeout=30)
    if result.returncode or result.stdout.strip() != case['expected'].strip():
        print('FAIL', case['folder'], '\nstdout:', result.stdout, '\nstderr:', result.stderr)
        sys.exit(1)
    print('OK', case['folder'], flush=True)
print(f'{len(cases)} examples passed.')
