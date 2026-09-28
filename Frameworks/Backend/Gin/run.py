from pathlib import Path
import argparse, subprocess, sys
root=Path(__file__).resolve().parent
parser=argparse.ArgumentParser()
parser.add_argument('file')
args=parser.parse_args()
path=(root/args.file).resolve()
if not path.is_relative_to(root) or not path.is_file() or path.name!='main.go': parser.error('과정 내부 main.go 경로를 지정하세요.')
sys.exit(subprocess.run(['go','run',str(path)],cwd=root).returncode)
