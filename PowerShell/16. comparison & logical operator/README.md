# 비교·논리·비트 연산자

## 핵심 개념

PowerShell 비교는 -eq 같은 이름형 연산자를 사용합니다. 배열을 왼쪽에 두면 결과 형태가 달라질 수 있습니다.

## 실행 방법

PowerShell 7에서 `pwsh -NoProfile -File ./example.ps1`로 실행합니다. 실행 정책이나 조직 정책이 막으면 오류 원인을 확인하고 관리 정책을 따르세요.

[실습 파일](example.ps1)

## 실행 예제

```powershell
20 -ge 19
'ABC' -eq 'abc'
'ABC' -ceq 'abc'
(20 -ge 19) -and (20 -lt 65)
-not $false
5 -band 3
5 -bor 3
5 -bxor 3
5 -shl 1
(1, 2, 3 -gt 1) -join ','
```

## 예상 결과

```text
True
True
False
True
True
1
7
6
10
2,3
```

## 동작 원리와 주의사항

문자열 비교는 기본적으로 대소문자를 무시하며 -ceq는 구분합니다. 스칼라 비교는 boolean이지만 컬렉션 왼쪽 비교는 조건에 맞는 요소를 반환합니다. -and·-or·-xor와 -band·-bor·-bxor는 논리와 비트 연산의 차이입니다.

## 문법 한눈에 보기

| 분류 | 문법 |
|---|---|
| 비교 | `-eq -ne -gt -ge -lt -le` |
| 논리 | `-and -or -xor -not` |
| 비트 | `-band -bor -bxor -bnot -shl -shr` |

## 직접 확인하기

빈 배열 비교와 -contains 결과를 비교하세요. -gt·-ge 경계값을 각각 시험하세요.

---

---

---

[전체 목차](../README.md) · [이전](../15.%20string%20%26%20format/README.md) · [다음](../17.%20contains%20%26%20like%20%26%20match/README.md)
