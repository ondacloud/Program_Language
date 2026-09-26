# switch

## 핵심 개념

입력과 일치하는 조건 블록을 실행합니다.

## 실행 방법

PowerShell 7에서 `pwsh -NoProfile -File ./example.ps1`로 실행합니다. 실행 정책이나 조직 정책이 막으면 오류 원인을 확인하고 관리 정책을 따르세요.

[실습 파일](example.ps1)

## 실행 예제

```powershell
$command = 'save'
switch -Exact ($command) {
  'save' { 'saved'; break }
  'open' { 'opened'; break }
  default { 'unknown' }
}
```

## 예상 결과

```text
saved
```

## 동작 원리와 주의사항

여러 조건이 일치하면 여러 블록이 실행될 수 있으므로 하나만 선택할 때 break를 사용합니다. 기본 문자열 비교는 대소문자를 구분하지 않습니다.



## 직접 확인하기

-CaseSensitive 옵션과 -Wildcard 옵션의 목적을 비교하세요.

---

[전체 목차](../README.md) · [이전](../03.%20if%20%26%20elseif%20%26%20else/README.md) · [다음](../05.%20for/README.md)
