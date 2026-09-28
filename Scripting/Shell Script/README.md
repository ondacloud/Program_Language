# Shell Script 학습 가이드

분류용 상위 폴더 없이 실제 문법·함수 이름을 번호순으로 배치했습니다. 폴더에서 README와 실행 파일을 바로 확인하세요.

## 실행 환경

Bash 4 이상에서 각 예제 폴더의 `bash example.sh`를 실행합니다. Windows에서는 Git Bash 또는 WSL의 Bash를 사용하세요.

## 목차

| 번호 | 문법·함수 | 설명 |
|---|---|---|
| 00 | [operator](00.%20operator/README.md) | 정수 산술·대입·증감 |
| 01 | [printf](01.%20printf/README.md) | 출력 — printf와 형식 문자열 |
| 02 | [read](02.%20read/README.md) | 입력 — read와 IFS |
| 03 | [if & elif & else](03.%20if%20%26%20elif%20%26%20else/README.md) | if / elif / else |
| 04 | [case & esac](04.%20case%20%26%20esac/README.md) | case / esac |
| 05 | [for](05.%20for/README.md) | for |
| 06 | [while](06.%20while/README.md) | while |
| 07 | [until](07.%20until/README.md) | until |
| 08 | [break](08.%20break/README.md) | break |
| 09 | [continue](09.%20continue/README.md) | continue |
| 10 | [function & local](10.%20function%20%26%20local/README.md) | 함수, local, 반환 상태 |
| 11 | [return](11.%20return/README.md) | 함수 인수·출력·반환 상태 |
| 12 | [array & declare](12.%20array%20%26%20declare/README.md) | 배열과 연관 배열 |
| 13 | [variable & quoting](13.%20variable%20%26%20quoting/README.md) | 변수와 따옴표 |
| 14 | [parameter expansion](14.%20parameter%20expansion/README.md) | 매개변수 확장과 명령 치환 |
| 15 | [test & comparison](15.%20test%20%26%20comparison/README.md) | 문자열·정수·파일 비교 |
| 16 | [logical operator & exit status](16.%20logical%20operator%20%26%20exit%20status/README.md) | 논리 연산과 종료 코드 |
| 17 | [set & positional parameters](17.%20set%20%26%20positional%20parameters/README.md) | 인수와 표준 입력 |
| 18 | [pipe & redirect](18.%20pipe%20%26%20redirect/README.md) | 파이프와 리디렉션 |
| 19 | [find & glob](19.%20find%20%26%20glob/README.md) | 파일 경로, glob, 임시 파일 |
| 20 | [trap & set](20.%20trap%20%26%20set/README.md) | 오류 처리, set 옵션, trap |
| 21 | [export & wait](21.%20export%20%26%20wait/README.md) | 프로세스와 환경 변수 |
| 22 | [grep & sed & awk](22.%20grep%20%26%20sed%20%26%20awk/README.md) | 텍스트 처리와 파일 읽기 |
| 23 | [getopts](23.%20getopts/README.md) | 옵션 처리와 스크립트 검사 |
| 24 | [bash & shebang](24.%20bash%20%26%20shebang/README.md) | Bash 스크립트와 실행 흐름 |

## 공식 참고 자료

- [GNU Bash 공식 매뉴얼](https://www.gnu.org/software/bash/manual/bash.html)
- [매개변수 확장](https://www.gnu.org/s/bash/manual/html_node/Shell-Parameter-Expansion.html)
- [ShellCheck](https://www.shellcheck.net/)

[전체 과정](../../README.md)
