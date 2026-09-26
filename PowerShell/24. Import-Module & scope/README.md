# 모듈, 범위, 재사용

## 핵심 개념

모듈은 재사용할 함수와 공개 인터페이스를 묶습니다. .psm1 파일에서 공개할 함수만 export합니다.

## 실행 방법

PowerShell 7에서 `pwsh -NoProfile -File ./example.ps1`로 실행합니다. 실행 정책이나 조직 정책이 막으면 오류 원인을 확인하고 관리 정책을 따르세요.

[실습 파일](example.ps1)

## 실행 예제

```powershell
$module = New-Module -Name StudyModule -ScriptBlock {
    function Get-StudyName { 'Study' }
    Export-ModuleMember -Function Get-StudyName
}
Import-Module $module
try {
    Get-StudyName
} finally {
    Remove-Module StudyModule
}
```

## 예상 결과

```text
Study
```

## 동작 원리와 주의사항

예제는 파일 없이 동적 모듈로 범위를 확인합니다. 실제 프로젝트에서는 StudyModule.psm1과 필요하면 .psd1 매니페스트로 버전·의존성을 관리합니다. dot-sourcing `. ./file.ps1`은 현재 범위에 실행하므로 일반 호출과 다릅니다. 전역 변수보다 명시적인 입력·출력을 사용하세요.

## 직접 확인하기

비공개 도움 함수를 추가하고 외부에서 직접 호출되지 않도록 export 목록을 유지하세요.

---

---

---

[전체 목차](../README.md) · [이전](../23.%20LASTEXITCODE%20%26%20native%20command/README.md) · [다음](../25.%20ShouldProcess%20%26%20WhatIf/README.md)
