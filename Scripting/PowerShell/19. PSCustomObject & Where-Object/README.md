# 객체 파이프라인

## 핵심 개념

cmdlet은 보통 텍스트가 아닌 객체를 출력합니다. 속성을 기준으로 필터링·정렬한 뒤 필요한 값을 선택합니다.

## 실행 방법

PowerShell 7에서 `pwsh -NoProfile -File ./example.ps1`로 실행합니다. 실행 정책이나 조직 정책이 막으면 오류 원인을 확인하고 관리 정책을 따르세요.

[실습 파일](example.ps1)

## 실행 예제

```powershell
$users = @(
    [pscustomobject]@{ Name = 'Alice'; Score = 90 }
    [pscustomobject]@{ Name = 'Bob'; Score = 70 }
)
$users |
    Where-Object Score -ge 80 |
    Sort-Object Score -Descending |
    Select-Object -ExpandProperty Name
```

## 예상 결과

```text
Alice
```

## 동작 원리와 주의사항

$_는 현재 파이프 객체를 가리킵니다. Get-Member로 타입·속성을 살펴보세요. Format-Table은 표시용 객체로 변환하므로 Export-Csv 전에 넣지 않습니다. 원본 데이터는 Select-Object로 선택하고 서식 명령은 화면 출력의 마지막 단계에 둡니다.

## 직접 확인하기

점수가 같은 사용자를 추가하고 Sort-Object Score, Name으로 두 기준 정렬을 작성하세요.

---

---

---

[전체 목차](../README.md) · [이전](../18.%20comparison%20operator/README.md) · [다음](../20.%20try%20%26%20catch%20%26%20throw/README.md)
