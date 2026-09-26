# 함수와 매개변수 검증

## 핵심 개념

param으로 입력을 선언하고 타입·검증 특성을 붙이면 호출 계약이 명확해집니다.

## 실행 방법

PowerShell 7에서 `pwsh -NoProfile -File ./example.ps1`로 실행합니다. 실행 정책이나 조직 정책이 막으면 오류 원인을 확인하고 관리 정책을 따르세요.

[실습 파일](example.ps1)

## 실행 예제

```powershell
function Get-Greeting {
    [CmdletBinding()]
    param(
        [Parameter(Mandatory)]
        [ValidateNotNullOrEmpty()]
        [string]$Name
    )
    "Hello $Name"
}
Get-Greeting -Name 'Alice'
```

## 예상 결과

```text
Hello Alice
```

## 동작 원리와 주의사항

함수의 성공 출력 스트림으로 나온 모든 값이 결과입니다. return 이전에 디버그 문자열을 출력하면 결과에 섞입니다. 진단은 Write-Verbose를 쓰고 필요 없는 반환은 $null = 호출 또는 Out-Null로 버립니다. 함수 내부 변수는 일반적으로 지역 범위입니다.

## 직접 확인하기

Write-Verbose를 추가하고 -Verbose 유무에 따라 성공 출력과 진단 출력을 구별하세요.

---

---

---

[전체 목차](../README.md) · [이전](../10.%20continue/README.md) · [다음](../12.%20return%20%26%20TryParse/README.md)
