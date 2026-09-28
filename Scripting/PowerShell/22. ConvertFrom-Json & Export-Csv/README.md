# JSON과 CSV 변환

## 핵심 개념

구조화된 데이터는 ConvertTo/From-Json, Export/Import-Csv 등으로 다룹니다.

## 실행 방법

PowerShell 7에서 `pwsh -NoProfile -File ./example.ps1`로 실행합니다. 실행 정책이나 조직 정책이 막으면 오류 원인을 확인하고 관리 정책을 따르세요.

[실습 파일](example.ps1)

## 실행 예제

```powershell
$user = [pscustomobject]@{
    Name = 'Alice'
    Tags = @('reader', 'writer')
}
$json = $user | ConvertTo-Json -Depth 5 -Compress
$restored = $json | ConvertFrom-Json
$restored.Name
$restored.Tags.Count
```

## 예상 결과

```text
Alice
2
```

## 동작 원리와 주의사항

JSON의 중첩 깊이가 깊으면 -Depth를 충분히 지정합니다. CSV는 평평한 표에 적합하고 가져온 값은 대개 문자열이므로 수치·날짜를 변환하세요. Export-Csv 앞에 Format-Table을 넣지 마세요. JSON 문법 성공과 필수 속성·범위 검증은 별개입니다.

## 직접 확인하기

Tags가 없거나 null인 입력을 받았을 때 처리 정책을 추가하세요.

---

---

---

[전체 목차](../README.md) · [이전](../21.%20Get-Content%20%26%20Set-Content%20%26%20Join-Path/README.md) · [다음](../23.%20LASTEXITCODE%20%26%20native%20command/README.md)
