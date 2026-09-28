# break

## 핵심 개념

반복을 끝냅니다.

## 실행 방법

PowerShell 7에서 `pwsh -NoProfile -File ./example.ps1`로 실행합니다. 실행 정책이나 조직 정책이 막으면 오류 원인을 확인하고 관리 정책을 따르세요.

[실습 파일](example.ps1)

## 실행 예제

```powershell
for ($n = 0; $n -lt 4; $n++) {
  if ($n -eq 2) { break }
  $n
}
```

## 예상 결과

```text
0
1
```

## 동작 원리와 주의사항

이 예제는 for 문 안에서 사용합니다. 파이프라인 스크립트 블록에서 동일하게 동작한다고 가정하지 마세요.



## 직접 확인하기

break와 continue를 바꿔 출력 차이를 설명하세요.

---

[전체 목차](../README.md) · [이전](../08.%20do%20%26%20while%20%26%20until/README.md) · [다음](../10.%20continue/README.md)
