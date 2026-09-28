# 타입 변환·함수 출력·배열

## 핵심 개념

PowerShell 함수는 성공 스트림에 출력된 모든 값을 결과로 전달합니다. return 값 하나만 결과라고 가정하면 안 됩니다.

## 실행 방법

PowerShell 7에서 `pwsh -NoProfile -File ./example.ps1`로 실행합니다. 실행 정책이나 조직 정책이 막으면 오류 원인을 확인하고 관리 정책을 따르세요.

[실습 파일](example.ps1)

## 실행 예제

```powershell
function Get-Double {
  param([int]$Value)
  return ($Value * 2)
}
$value = 0
[int]::TryParse('12', [ref]$value)
Get-Double -Value $value
$items = @(Get-Double 2; Get-Double 3)
$items.Count
$items -join ','
$person = @{ Name = 'Kim'; Age = 20 }
$person['Name']
```

## 예상 결과

```text
True
24
2
4,6
Kim
```

## 동작 원리와 주의사항

TryParse는 변환 성공 여부를 반환하고 [ref]로 결과를 전달합니다. 함수 안의 디버깅 문자열도 결과에 섞일 수 있으므로 Write-Verbose 등을 고려하세요. @()로 결과를 배열로 감싸면 0·1·여러 항목에서 Count를 일관되게 다룰 수 있습니다. 해시테이블은 키 기반 컬렉션입니다.



## 직접 확인하기

TryParse에 bad를 넣고 실패 시 함수를 호출하지 않도록 분기하세요. 함수 안에 문자열을 하나 추가해 반환 배열이 바뀌는지 확인하세요.

---

---

---

[전체 목차](../README.md) · [이전](../11.%20function%20%26%20param/README.md) · [다음](../13.%20array%20%26%20hashtable/README.md)
