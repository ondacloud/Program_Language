# 포함·와일드카드·정규식·null

## 핵심 개념

포함 검사는 목록의 요소를, -like는 와일드카드를, -match는 정규식을 비교합니다.

## 실행 방법

PowerShell 7에서 `pwsh -NoProfile -File ./example.ps1`로 실행합니다. 실행 정책이나 조직 정책이 막으면 오류 원인을 확인하고 관리 정책을 따르세요.

[실습 파일](example.ps1)

## 실행 예제

```powershell
$names = @('Alice', 'Bob')
$names -contains 'Bob'
'Bob' -in $names
'report.txt' -like '*.txt'
'item42' -match '^item(\d+)$'
$Matches[1]
$value = $null
$null -eq $value
$value ?? 'fallback'
($true ? 'yes' : 'no')
```

## 예상 결과

```text
True
True
True
True
42
True
fallback
yes
```

## 동작 원리와 주의사항

-contains는 부분 문자열 검사가 아닙니다. -match 성공 시 스칼라 문자열의 캡처는 $Matches에 저장되며 실패 후 예전 값이 남을 수 있으므로 성공 분기에서 읽으세요. null 비교는 $null을 왼쪽에 두면 컬렉션 필터링 혼동을 줄입니다. ??와 삼항 연산자는 PowerShell 7 기준입니다.



## 직접 확인하기

정규식이 실패한 경우 $Matches를 사용하지 않도록 if로 감싸세요. -notcontains·-notin을 사용해 보세요.

---

---

---

[전체 목차](../README.md) · [이전](../16.%20comparison%20%26%20logical%20operator/README.md) · [다음](../18.%20comparison%20operator/README.md)
