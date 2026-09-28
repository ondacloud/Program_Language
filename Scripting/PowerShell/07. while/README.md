# while

## 핵심 개념

조건을 본문 실행 전에 검사합니다.

## 실행 방법

PowerShell 7에서 `pwsh -NoProfile -File ./example.ps1`로 실행합니다. 실행 정책이나 조직 정책이 막으면 오류 원인을 확인하고 관리 정책을 따르세요.

[실습 파일](example.ps1)

## 실행 예제

```powershell
$n = 0
while ($n -lt 3) { $n; $n++ }
```

## 예상 결과

```text
0
1
2
```

## 동작 원리와 주의사항

갱신 누락과 continue로 갱신이 건너뛰어지는 경우를 주의하세요.



## 직접 확인하기

처음부터 조건이 거짓인 값을 넣어 보세요.

---

[전체 목차](../README.md) · [이전](../06.%20foreach/README.md) · [다음](../08.%20do%20%26%20while%20%26%20until/README.md)
