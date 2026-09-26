# 연산자와 조건문

## 핵심 개념

비교에는 -eq, -ne, -gt 등의 연산자를 사용합니다. ==는 PowerShell 비교 문법이 아닙니다.

## 실행 방법

PowerShell 7에서 `pwsh -NoProfile -File ./example.ps1`로 실행합니다. 실행 정책이나 조직 정책이 막으면 오류 원인을 확인하고 관리 정책을 따르세요.

[실습 파일](example.ps1)

## 실행 예제

```powershell
$score = 85
if ($score -ge 90) {
    'A'
} elseif ($score -ge 80) {
    'B'
} else {
    'C'
}
'PowerShell' -like 'Power*'
'ABC' -ceq 'abc'
```

## 예상 결과

```text
B
True
False
```

## 동작 원리와 주의사항

문자열 비교는 기본적으로 대소문자를 구분하지 않으며 -ceq처럼 c 접두사로 구분합니다. -like는 wildcard, -match는 정규식입니다. 배열에 -eq를 적용하면 단일 bool이 아니라 일치한 원소가 나올 수 있습니다. 포함 여부는 -contains 또는 -in을 고려하세요.

## 직접 확인하기

@(1,2,2) -eq 2와 @(1,2,2) -contains 2의 결과 타입을 비교하세요.

---

---

---

[전체 목차](../README.md) · [이전](../17.%20contains%20%26%20like%20%26%20match/README.md) · [다음](../19.%20PSCustomObject%20%26%20Where-Object/README.md)
