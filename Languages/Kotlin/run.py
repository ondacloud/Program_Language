from pathlib import Path
import argparse, shutil, subprocess, tempfile, sys
root = Path(__file__).resolve().parent
parser = argparse.ArgumentParser(description='한 Kotlin 예제를 임시 JAR로 컴파일·실행합니다.')
parser.add_argument('file')
args = parser.parse_args()
source = (root / args.file).resolve()
if not source.is_relative_to(root) or source.suffix != '.kt' or not source.is_file():
    parser.error('과정 내부의 .kt 파일을 지정하세요.')
compiler = shutil.which('kotlinc') or shutil.which('kotlinc.bat')
java = shutil.which('java')
if not compiler or not java:
    parser.error('JDK와 Kotlin compiler를 설치하고 PATH에 추가하세요.')
with tempfile.TemporaryDirectory(prefix='kotlin-course-') as tmp:
    # Windows batch parsing must not see lesson paths containing ampersands.
    shutil.copy2(source, Path(tmp) / 'Main.kt')
    options = ['-kotlin-home', str(Path(compiler).resolve().parent.parent)] if compiler.lower().endswith('.bat') else []
    result = subprocess.run([compiler, *options, 'Main.kt', '-include-runtime', '-d', 'lesson.jar'], cwd=tmp)
    if result.returncode: sys.exit(result.returncode)
    sys.exit(subprocess.run([java, '-jar', 'lesson.jar'], cwd=tmp).returncode)
