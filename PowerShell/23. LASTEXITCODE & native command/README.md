# 외부 프로그램과 종료 코드

## 핵심 개념

& 호출 연산자는 경로 문자열이나 변수에 담긴 실행 파일을 호출합니다. 인수는 별도로 전달합니다.

## 실행 방법

PowerShell 7에서 `pwsh -NoProfile -File ./example.ps1`로 실행합니다. 실행 정책이나 조직 정책이 막으면 오류 원인을 확인하고 관리 정책을 따르세요.

[실습 파일](example.ps1)

## 실행 예제

```powershell
$runtimePath = (Get-Process -Id $PID).Path
& $runtimePath -NoProfile -Command 'exit 3'
$exitCode = $LASTEXITCODE
"exit=$exitCode"
if ($exitCode -ne 0) {
    'handled failure'
}
```

## 예상 결과

```text
exit=3
handled failure
```

## 동작 원리와 주의사항

호출 직후 종료 코드를 저장하세요. 이후 외부 명령이 값을 바꿀 수 있습니다. Invoke-Expression으로 명령 문자열을 조립하는 대신 &와 인수 배열을 사용합니다. PowerShell과 외부 실행 파일은 따옴표·인수 파싱 규칙이 다를 수 있어 공백 인수를 시험해야 합니다.

## 직접 확인하기

자식 프로그램의 exit를 0으로 바꾸면 오류 처리 메시지가 사라지는지 확인하세요.

---

---

---

[전체 목차](../README.md) · [이전](../22.%20ConvertFrom-Json%20%26%20Export-Csv/README.md) · [다음](../24.%20Import-Module%20%26%20scope/README.md)
