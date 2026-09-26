# WhatIf와 검증 가능한 자동화

## 핵심 개념

SupportsShouldProcess를 선언한 변경 함수는 수행할 작업을 미리 보여 주는 -WhatIf를 지원할 수 있습니다.

## 실행 방법

PowerShell 7에서 `pwsh -NoProfile -File ./example.ps1`로 실행합니다. 실행 정책이나 조직 정책이 막으면 오류 원인을 확인하고 관리 정책을 따르세요.

[실습 파일](example.ps1)

## 실행 예제

```powershell
function Set-StudyValue {
    [CmdletBinding(SupportsShouldProcess)]
    param([string]$Name = 'demo')
    if ($PSCmdlet.ShouldProcess($Name, 'Set study value')) {
        "updated:$Name"
    }
}
Set-StudyValue -Name 'sample' -WhatIf
Set-StudyValue -Name 'sample' -Confirm:$false
```

## 예상 결과

```text
첫 호출: WhatIf 안내, 실제 본문 실행 없음
두 번째 호출: updated:sample
```

## 동작 원리와 주의사항

ShouldProcess를 호출하지 않고 특성만 붙여서는 변경 코드가 자동 보호되지 않습니다. 대상과 작업을 구체적으로 표시하세요. 이 예제는 실제 자원을 변경하지 않고 흐름만 출력합니다. Pester를 도입하면 정상·오류·WhatIf 경로를 테스트할 수 있으며 설치 버전과 테스트 문법을 맞춰야 합니다.

## 직접 확인하기

WhatIf일 때 updated 메시지가 없음을 확인하세요. 실제 파일 변경은 임시 폴더에서 테스트하세요.

---

---

---

[전체 목차](../README.md) · [이전](../24.%20Import-Module%20%26%20scope/README.md) · [다음](../26.%20pwsh%20%26%20Get-Command/README.md)
