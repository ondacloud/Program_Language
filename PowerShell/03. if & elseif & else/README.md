# if / elseif / else

## 핵심 개념

조건에 맞는 첫 분기를 선택합니다.

## 실행 방법

PowerShell 7에서 `pwsh -NoProfile -File ./example.ps1`로 실행합니다. 실행 정책이나 조직 정책이 막으면 오류 원인을 확인하고 관리 정책을 따르세요.

[실습 파일](example.ps1)

## 실행 예제

```powershell
$n = 0
if ($n -gt 0) { 'positive' }
elseif ($n -eq 0) { 'zero' }
else { 'negative' }
```

## 예상 결과

```text
zero
```

## 동작 원리와 주의사항

PowerShell에서는 elseif가 한 단어입니다. 비교에는 -eq·-gt 등을 사용하며 대입 =과 구별합니다.



## 직접 확인하기

-1·0·1로 실행하세요.

---

[전체 목차](../README.md) · [이전](../02.%20Read-Host%20%26%20ReadLine/README.md) · [다음](../04.%20switch/README.md)
