# 예외와 오류 스트림

## 핵심 개념

try/catch는 종료 오류를 처리합니다. 비종료 오류를 잡으려면 필요한 명령에 -ErrorAction Stop을 지정합니다.

## 실행 방법

PowerShell 7에서 `pwsh -NoProfile -File ./example.ps1`로 실행합니다. 실행 정책이나 조직 정책이 막으면 오류 원인을 확인하고 관리 정책을 따르세요.

[실습 파일](example.ps1)

## 실행 예제

```powershell
try {
    $value = [int]'invalid'
    $value
} catch {
    'invalid number'
} finally {
    'cleanup'
}
```

## 예상 결과

```text
invalid number
cleanup
```

## 동작 원리와 주의사항

Write-Error는 보통 비종료 오류이고 throw는 종료 오류입니다. 전역 설정을 바꾸기보다 실패를 다룰 명령의 범위를 명확히 하세요. 네이티브 실행 파일의 실패는 기본적으로 .NET 예외와 같지 않으므로 호출 직후 $LASTEXITCODE를 확인합니다. $error에는 최근 오류 기록이 저장됩니다.

## 직접 확인하기

존재하지 않는 경로의 Get-Item에 -ErrorAction Stop을 사용하여 catch 실행을 확인하세요.

---

---

---

[전체 목차](../README.md) · [이전](../19.%20PSCustomObject%20%26%20Where-Object/README.md) · [다음](../21.%20Get-Content%20%26%20Set-Content%20%26%20Join-Path/README.md)
