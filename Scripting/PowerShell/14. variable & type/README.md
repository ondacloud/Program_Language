# 변수, 타입, null

## 핵심 개념

변수는 $로 시작합니다. 값을 대입하면 타입을 가지며 필요하면 타입 제약을 명시합니다.

## 실행 방법

PowerShell 7에서 `pwsh -NoProfile -File ./example.ps1`로 실행합니다. 실행 정책이나 조직 정책이 막으면 오류 원인을 확인하고 관리 정책을 따르세요.

[실습 파일](example.ps1)

## 실행 예제

```powershell
[int]$count = 3
$name = 'Alice'
$missing = $null
"$name : $count"
$count.GetType().Name
$null -eq $missing
```

## 예상 결과

```text
Alice : 3
Int32
True
```

## 동작 원리와 주의사항

예약된 자동 변수 $HOME, $PID 등과 충돌하는 이름을 피하세요. 이름은 기본적으로 대소문자를 구분하지 않습니다. $null 비교는 왼쪽에 두면 컬렉션 비교 의미로 인한 혼동을 줄일 수 있습니다. [int] 변환이 모든 잘못된 입력을 자동 처리해 주지는 않습니다.

## 직접 확인하기

[int] 변수에 숫자가 아닌 문자열을 넣었을 때 변환 오류를 확인하세요.

---

---

---

[전체 목차](../README.md) · [이전](../13.%20array%20%26%20hashtable/README.md) · [다음](../15.%20string%20%26%20format/README.md)
