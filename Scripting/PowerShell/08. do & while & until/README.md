# do / while / until

## 핵심 개념

do 반복은 먼저 본문을 실행한 뒤 종료 조건을 확인합니다.

## 실행 방법

PowerShell 7에서 `pwsh -NoProfile -File ./example.ps1`로 실행합니다. 실행 정책이나 조직 정책이 막으면 오류 원인을 확인하고 관리 정책을 따르세요.

[실습 파일](example.ps1)

## 실행 예제

```powershell
$n = 3
do { $n; $n++ } while ($n -lt 3)
$n = 0
do { $n++ } until ($n -ge 2)
$n
```

## 예상 결과

```text
3
2
```

## 동작 원리와 주의사항

while은 참인 동안, until은 참이 될 때까지 반복합니다. 둘 다 최소 한 번은 실행됩니다.



## 직접 확인하기

첫 번째 문장을 while만 사용하는 코드로 바꾸고 출력 차이를 비교하세요.

---

[전체 목차](../README.md) · [이전](../07.%20while/README.md) · [다음](../09.%20break/README.md)
