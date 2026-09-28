# 파일 입출력 — fopen / fclose

## 핵심 개념

파일 열기, 읽기·쓰기, 닫기는 각각 실패할 수 있습니다. `FILE *`의 유효성과 반환값을 확인합니다.

## 실행 예제

```c
#include <stdio.h>

int main(void) {
    FILE *file = fopen("example.txt", "r");
    if (file == NULL) {
        perror("fopen");
        return 1;
    }
    char line[128];
    while (fgets(line, sizeof line, file) != NULL) {
        fputs(line, stdout);
    }
    int failed = ferror(file);
    if (fclose(file) == EOF) {
        failed = 1;
    }
    return failed ? 1 : 0;
}
```

## 실행 결과

```text
example.txt에 Hello C와 줄바꿈이 있으면: Hello C
```

## 동작 원리와 주의사항

먼저 실행 폴더에 `example.txt`를 만드세요. 상대 경로는 소스 파일 위치가 아니라 현재 작업 디렉터리 기준입니다. `fgets`는 버퍼 크기-1까지 읽으므로 긴 줄은 여러 번 나뉩니다. `feof`를 먼저 검사하는 반복 대신 읽기 함수 결과를 검사합니다.

## 모드와 쓰기

| 모드 | 의미 |
|---|---|
| `r` | 기존 파일 읽기 |
| `w` | 생성 또는 기존 내용 지우고 쓰기 |
| `a` | 끝에 추가 |
| `r+` | 기존 파일 읽기·쓰기 |
| `wb`, `rb` | 바이너리 모드 |
| `wx` | C11 이상, 이미 존재하면 생성 실패 |

`b`와 `x`는 단독 모드가 아닙니다. `t`는 ISO C 표준 모드 지정자가 아닙니다. 쓰기는 `fprintf`의 음수 반환과 `fclose`의 `EOF`를 확인하세요. `w` 모드는 기존 내용을 지우므로 연습용 파일을 사용하세요.

## 직접 확인하기

존재하지 않는 파일과 빈 파일을 각각 읽어 오류와 정상 종료를 구분하세요.

---

[언어 목차](../README.md) · [이전](../13.%20pointer/README.md) · [다음](../15.%20Dynamic%20Memory%20Allocation/README.md)

## 동봉 실행 파일과 실행 방법

각 예제는 독립적으로 실행합니다. 추가 예제는 examples 하위 폴더에 분리했습니다. 소스 파일을 수정한 뒤 다시 실행하며, 컴파일 언어는 다시 빌드하세요.

### 예제 1

이 문서와 같은 폴더에서 실행합니다.

[main.c](main.c) · [example.txt](example.txt)

```sh
gcc -std=c17 -Wall -Wextra -Wpedantic main.c -o app
```

빌드 후 Windows PowerShell은 `.\app.exe`, Linux/macOS는 `./app`으로 실행합니다.
