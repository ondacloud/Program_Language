import argparse
from loader import load
parser = argparse.ArgumentParser(description='선택한 장의 서버 실행')
parser.add_argument('file')
parser.add_argument('--port', type=int, default=8000)
args = parser.parse_args()
module = load(args.file)
import uvicorn
uvicorn.run(module.app, host="127.0.0.1", port=args.port)
