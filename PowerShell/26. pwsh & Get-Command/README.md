# PowerShell 실행과 도움말

## 핵심 개념

PowerShell은 .NET 객체를 파이프로 전달하는 자동화 셸입니다. 이 과정은 PowerShell 7.x를 기준으로 합니다.

## 실행 방법

PowerShell 7에서 `pwsh -NoProfile -File ./example.ps1`로 실행합니다. 실행 정책이나 조직 정책이 막으면 오류 원인을 확인하고 관리 정책을 따르세요.

[실습 파일](example.ps1)

## 실행 예제

```powershell
"Hello PowerShell"
$command = Get-Command Get-Date
$command.Name
```

## 예상 결과

```text
Hello PowerShell
Get-Date
```

## 동작 원리와 주의사항

Windows PowerShell 5.1의 powershell.exe와 PowerShell 7의 pwsh.exe를 구별하세요. Get-Help 명령명 -Examples로 사용법을, Get-Command로 명령 존재를 확인합니다. 스크립트의 출력 스트림과 화면 표시를 구분하고, 다른 셸의 ls 같은 별칭보다 정식 cmdlet 이름을 학습하세요.

## 직접 확인하기

Get-Help Get-ChildItem -Examples를 조회하고 -LiteralPath의 의미를 확인하세요.

---

---

---

[전체 목차](../README.md) · [이전](../25.%20ShouldProcess%20%26%20WhatIf/README.md)
