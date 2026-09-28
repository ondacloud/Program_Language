from pathlib import Path
import argparse, shutil, subprocess, sys
root = Path(__file__).resolve().parent
parser = argparse.ArgumentParser(description='선택한 Flutter 예제를 웹 실습 프로젝트로 실행합니다.')
parser.add_argument('file')
parser.add_argument('--device', default='chrome', choices=['chrome', 'edge', 'web-server'])
parser.add_argument('--analyze-only', action='store_true')
args = parser.parse_args()
source = (root / args.file).resolve()
if not source.is_relative_to(root) or source.suffix != '.dart' or not source.is_file():
    parser.error('과정 내부의 .dart 파일을 지정하세요.')
flutter = shutil.which('flutter') or shutil.which('flutter.bat')
if not flutter: parser.error('Flutter SDK를 설치하고 PATH에 추가하세요.')
project = root / '.playground'
def run(command, cwd):
    result = subprocess.run(command, cwd=cwd)
    if result.returncode: sys.exit(result.returncode)
if not (project / 'pubspec.yaml').exists():
    run([flutter, 'create', '--platforms=web', '--empty', '--project-name=flutter_course', '.playground'], root)
shutil.copy2(source, project / 'lib/main.dart')
if args.analyze_only: run([flutter, 'analyze', 'lib/main.dart'], project)
else: run([flutter, 'run', '-d', args.device], project)
