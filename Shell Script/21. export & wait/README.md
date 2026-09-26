# 프로세스와 환경 변수

## 핵심 개념

export한 변수는 자식 프로세스의 환경으로 전달됩니다. 자식 프로세스가 바꾼 값은 부모로 되돌아오지 않습니다.

## 실행 방법

Bash 터미널에서 `bash example.sh`로 실행합니다. Windows의 cmd/PowerShell 구문과 다릅니다. 파일은 UTF-8, LF 줄바꿈으로 저장하세요.

[실습 파일](example.sh)

## 실행 예제

```bash
#!/usr/bin/env bash
export STUDY_MODE='demo'
bash -c 'printf "%s\n" "$STUDY_MODE"'
( STUDY_MODE='child'; printf '%s\n' "$STUDY_MODE" )
printf '%s\n' "$STUDY_MODE"
printf 'background\n' &
job_pid=$!
wait "$job_pid"
printf 'joined\n'
```

## 예상 결과

```text
demo
child
demo
background
joined
```

## 동작 원리와 주의사항

소괄호는 서브셸이며 변수 변경이 바깥에 남지 않습니다. &는 비동기 실행, $!는 직전 백그라운드 작업 PID, wait는 종료 대기입니다. source는 현재 셸에서 파일을 실행하므로 신뢰하는 스크립트만 로드하세요. 환경 변수에 비밀을 넣어도 프로세스·로그 노출 가능성이 사라지지는 않습니다.

## 직접 확인하기

소괄호를 중괄호 그룹으로 바꾸면 값의 수명이 어떻게 달라지는지 확인하세요.

---

---

---

[전체 목차](../README.md) · [이전](../20.%20trap%20%26%20set/README.md) · [다음](../22.%20grep%20%26%20sed%20%26%20awk/README.md)
