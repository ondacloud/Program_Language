from pathlib import Path
import subprocess, sys
root=Path(__file__).resolve().parent
for main in sorted(root.glob('*/main.go')):
    print('Testing', main.parent.name, flush=True)
    result=subprocess.run(['go','test',str(main),str(main.with_name('main_test.go'))],cwd=root)
    if result.returncode:sys.exit(result.returncode)
print('18 Gin examples passed.')
