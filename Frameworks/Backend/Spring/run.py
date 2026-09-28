from pathlib import Path
import argparse, os, re, shutil, subprocess, sys
root=Path(__file__).resolve().parent
parser=argparse.ArgumentParser()
parser.add_argument('file')
args=parser.parse_args()
path=(root/args.file).resolve()
if not path.is_relative_to(root) or not path.is_file() or path.name!='Main.java':parser.error('과정 내부 Main.java 경로를 지정하세요.')
mvn=shutil.which('mvn') or shutil.which('mvn.cmd')
if not mvn:parser.error('Maven 3.6.3 이상을 설치하고 PATH에 추가하세요.')
result=subprocess.run([mvn,'-q','compile','dependency:build-classpath','-Dmdep.outputFile=target/classpath.txt'],cwd=root)
if result.returncode:sys.exit(result.returncode)
package=re.search(r'package\s+([\w.]+);',path.read_text(encoding='utf-8')).group(1)
classpath=str(root/'target/classes')+os.pathsep+(root/'target/classpath.txt').read_text().strip()
sys.exit(subprocess.run(['java','-cp',classpath,package+'.Main'],cwd=root).returncode)
