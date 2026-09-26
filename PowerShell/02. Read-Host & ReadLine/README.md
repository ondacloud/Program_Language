# 입력 — Read-Host와 ReadLine

## 핵심 개념

Read-Host는 대화형 프롬프트 입력에 사용하고 Console.ReadLine은 표준 입력의 한 줄을 읽습니다.

## 실행 방법

PowerShell 7에서 `pwsh -NoProfile -File ./example.ps1`로 실행합니다. 실행 정책이나 조직 정책이 막으면 오류 원인을 확인하고 관리 정책을 따르세요.

[실습 파일](example.ps1)

## 실행 예제

```powershell
$name = [Console]::ReadLine()
if ($null -eq $name) {
    Write-Error 'no input'
    exit 1
}
"Hello $name"
```

## 예상 결과

```text
Hello Alice
```

## 동작 원리와 주의사항

실행 후 Alice와 Enter를 입력하세요. 대화형 프롬프트를 표시하려면 첫 줄을 $name = Read-Host "이름"으로 바꿀 수 있습니다. 이 파일은 리디렉션 입력도 검증할 수 있게 ReadLine을 사용합니다. 문자열을 숫자로 사용할 때는 TryParse 등으로 검증하세요. 빈 문자열과 EOF의 $null은 다릅니다.



## 직접 확인하기

빈 줄·공백 포함 문자열을 입력하세요. Read-Host 버전으로 바꾸고 프롬프트 동작을 비교하세요.

---

---

[전체 목차](../README.md) · [이전](../01.%20Write-Output/README.md) · [다음](../03.%20if%20%26%20elseif%20%26%20else/README.md)
