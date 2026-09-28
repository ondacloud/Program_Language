# 경로와 파일 입출력

## 핵심 개념

Join-Path로 경로를 만들고 사용자 경로는 wildcard 해석 없는 -LiteralPath로 전달합니다.

## 실행 방법

PowerShell 7에서 `pwsh -NoProfile -File ./example.ps1`로 실행합니다. 실행 정책이나 조직 정책이 막으면 오류 원인을 확인하고 관리 정책을 따르세요.

[실습 파일](example.ps1)

## 실행 예제

```powershell
$tempFile = [System.IO.Path]::GetTempFileName()
try {
    Set-Content -LiteralPath $tempFile -Value 'Hello file' -Encoding utf8
    (Get-Content -LiteralPath $tempFile -Raw).TrimEnd()
} finally {
    Remove-Item -LiteralPath $tempFile
}
```

## 예상 결과

```text
Hello file
```

## 동작 원리와 주의사항

예제는 직접 만든 임시 파일 하나를 정리합니다. Set-Content는 내용을 덮어쓰고 Add-Content는 추가합니다. -Raw는 한 문자열로 읽고 기본 Get-Content는 줄 단위 결과를 냅니다. Windows PowerShell 5.1과 PowerShell 7의 기본 인코딩 차이를 피하려면 인코딩을 명시하세요.

## 직접 확인하기

공백과 대괄호가 있는 파일명을 연습 폴더에 만들고 LiteralPath로 읽어 보세요.

---

---

---

[전체 목차](../README.md) · [이전](../20.%20try%20%26%20catch%20%26%20throw/README.md) · [다음](../22.%20ConvertFrom-Json%20%26%20Export-Csv/README.md)
